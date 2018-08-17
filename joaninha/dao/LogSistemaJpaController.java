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
import joaninha.modelos.LogSistema;

/**
 *
 * @author rafael.lopes
 */
public class LogSistemaJpaController implements Serializable {



    public void create(LogSistema logSistema) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            em.persist(logSistema);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLogSistema(logSistema.getLogSistemaId()) != null) {
                throw new PreexistingEntityException("LogSistema " + logSistema + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LogSistema logSistema) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            logSistema = em.merge(logSistema);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = logSistema.getLogSistemaId();
                if (findLogSistema(id) == null) {
                    throw new NonexistentEntityException("The logSistema with id " + id + " no longer exists.");
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
            LogSistema logSistema;
            try {
                logSistema = em.getReference(LogSistema.class, id);
                logSistema.getLogSistemaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The logSistema with id " + id + " no longer exists.", enfe);
            }
            em.remove(logSistema);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LogSistema> findLogSistemaEntities() {
        return findLogSistemaEntities(true, -1, -1);
    }

    public List<LogSistema> findLogSistemaEntities(int maxResults, int firstResult) {
        return findLogSistemaEntities(false, maxResults, firstResult);
    }

    private List<LogSistema> findLogSistemaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LogSistema.class));
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

    public LogSistema findLogSistema(Integer id) {
        EntityManager em = ConnectionFactory.em();
        try {
            return em.find(LogSistema.class, id);
        } finally {
            em.close();
        }
    }

    public int getLogSistemaCount() {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LogSistema> rt = cq.from(LogSistema.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
}
