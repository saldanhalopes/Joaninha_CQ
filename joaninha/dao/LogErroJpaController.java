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
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import joaninha.dao.exceptions.NonexistentEntityException;
import joaninha.dao.exceptions.PreexistingEntityException;
import joaninha.modelos.LogErro;
import joaninha.modelos.LogLogin;
import joaninha.util.DataHora;

/**
 *
 * @author rafael.lopes
 */
public class LogErroJpaController implements Serializable {


    public void create(LogErro logErro) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            em.persist(logErro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLogErro(logErro.getLogId()) != null) {
                throw new PreexistingEntityException("LogErro " + logErro + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LogErro logErro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            logErro = em.merge(logErro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = logErro.getLogId();
                if (findLogErro(id) == null) {
                    throw new NonexistentEntityException("The logErro with id " + id + " no longer exists.");
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
            LogErro logErro;
            try {
                logErro = em.getReference(LogErro.class, id);
                logErro.getLogId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The logErro with id " + id + " no longer exists.", enfe);
            }
            em.remove(logErro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LogErro> findLogErroEntities() {
        return findLogErroEntities(true, -1, -1);
    }

    public List<LogErro> findLogErroEntities(int maxResults, int firstResult) {
        return findLogErroEntities(false, maxResults, firstResult);
    }

    private List<LogErro> findLogErroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LogErro.class));
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

    public LogErro findLogErro(Integer id) {
        EntityManager em = ConnectionFactory.em();
        try {
            return em.find(LogErro.class, id);
        } finally {
            em.close();
        }
    }

    public int getLogErroCount() {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LogErro> rt = cq.from(LogErro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
        public void logSQLException(Exception ex, String classe) throws Exception {
        LogErro logerro = new LogErro();
        logerro.setTipo("Exception");
        logerro.setClasse(classe);
        logerro.setErro(ex.toString());
        logerro.setData(DataHora.getTimestampDate(new Date()));
        logerro.setUserName(System.getProperty("user"));
        try {
            logerro.setComputador(java.net.InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex1) {
            logerro.setComputador(ex1.toString());
        }
        logerro.setUserComputador(System.getProperty("user.name"));
        create(logerro);
    }
    
}
