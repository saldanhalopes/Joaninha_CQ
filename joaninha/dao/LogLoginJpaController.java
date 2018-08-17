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
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import joaninha.dao.exceptions.NonexistentEntityException;
import joaninha.dao.exceptions.PreexistingEntityException;
import joaninha.modelos.LogLogin;

/**
 *
 * @author rafael.lopes
 */
public class LogLoginJpaController implements Serializable {


    public void create(LogLogin logLogin) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            em.persist(logLogin);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLogLogin(logLogin.getId()) != null) {
                throw new PreexistingEntityException("LogLogin " + logLogin + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LogLogin logLogin) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            logLogin = em.merge(logLogin);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = logLogin.getId();
                if (findLogLogin(id) == null) {
                    throw new NonexistentEntityException("The logLogin with id " + id + " no longer exists.");
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
            LogLogin logLogin;
            try {
                logLogin = em.getReference(LogLogin.class, id);
                logLogin.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The logLogin with id " + id + " no longer exists.", enfe);
            }
            em.remove(logLogin);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LogLogin> findLogLoginEntities() {
        return findLogLoginEntities(true, -1, -1);
    }

    public List<LogLogin> findLogLoginEntities(int maxResults, int firstResult) {
        return findLogLoginEntities(false, maxResults, firstResult);
    }

    private List<LogLogin> findLogLoginEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LogLogin.class));
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

    public LogLogin findLogLogin(Integer id) {
        EntityManager em = ConnectionFactory.em();
        try {
            return em.find(LogLogin.class, id);
        } finally {
            em.close();
        }
    }

    public int getLogLoginCount() {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LogLogin> rt = cq.from(LogLogin.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    
}
