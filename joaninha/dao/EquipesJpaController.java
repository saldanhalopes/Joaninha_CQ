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
import joaninha.modelos.Equipes;

/**
 *
 * @author rafael.lopes
 */
public class EquipesJpaController implements Serializable {

    public void create(Equipes equipes) {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            em.persist(equipes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Equipes equipes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            equipes = em.merge(equipes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = equipes.getEquipeId();
                if (findEquipes(id) == null) {
                    throw new NonexistentEntityException("The equipes with id " + id + " no longer exists.");
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
            Equipes equipes;
            try {
                equipes = em.getReference(Equipes.class, id);
                equipes.getEquipeId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The equipes with id " + id + " no longer exists.", enfe);
            }
            em.remove(equipes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Equipes> findEquipesEntities() {
        return findEquipesEntities(true, -1, -1);
    }

    public List<Equipes> findEquipesEntities(int maxResults, int firstResult) {
        return findEquipesEntities(false, maxResults, firstResult);
    }

    private List<Equipes> findEquipesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Equipes.class));
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

    public Equipes findEquipes(Integer id) {
        EntityManager em = ConnectionFactory.em();
        try {
            return em.find(Equipes.class, id);
        } finally {
            em.close();
        }
    }

    public int getEquipesCount() {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Equipes> rt = cq.from(Equipes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
