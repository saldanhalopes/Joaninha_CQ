/*
 * Copyright (C) 2018 rafael.lopes
 *
 * Este programa é um software livre: você pode redistribuí-lo e / ou modificar
 * sob os termos da GNU General Public License, conforme publicado pela
 * a Free Software Foundation, seja a versão 3 da Licença, quanto
 * qualquer versão posterior.
 *
 * Este programa é distribuído na esperança de que seja útil,
 * mas SEM QUALQUER GARANTIA; sem a garantia implícita de
 * COMERCIALIZAÇÃO OU APTIDÃO PARA UM PROPÓSITO PARTICULAR. Veja o
 * GNU General Public License para obter mais detalhes.
 *
 * Você deve ter recebido uma cópia da GNU General Public License
 *  juntamente com este programa. Caso contrário, veja <http://www.gnu.org/licenses/>.
 */
package joaninha.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import joaninha.dao.exceptions.NonexistentEntityException;
import joaninha.dao.exceptions.PreexistingEntityException;
import joaninha.modelos.Groups;

/**
 *
 * @author rafael.lopes
 */
public class GroupsJpaController implements Serializable {

    public void create(Groups groups) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            em.persist(groups);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findGroups(groups.getGroupId()) != null) {
                throw new PreexistingEntityException("Groups " + groups + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Groups groups) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            groups = em.merge(groups);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = groups.getGroupId();
                if (findGroups(id) == null) {
                    throw new NonexistentEntityException("The groups with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            Groups groups;
            try {
                groups = em.getReference(Groups.class, id);
                groups.getGroupId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The groups with id " + id + " no longer exists.", enfe);
            }
            em.remove(groups);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Groups> findGroupsEntities() {
        return findGroupsEntities(true, -1, -1);
    }

    public List<Groups> findGroupsEntities(int maxResults, int firstResult) {
        return findGroupsEntities(false, maxResults, firstResult);
    }

    private List<Groups> findGroupsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Groups.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Groups findGroups(Integer id) {
        EntityManager em = ConnectionFactory.em();
        try {
            return em.find(Groups.class, id);
        } finally {
            em.close();
        }
    }

    public int getGroupsCount() {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Groups> rt = cq.from(Groups.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
