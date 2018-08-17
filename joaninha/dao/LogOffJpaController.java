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
import javax.persistence.EntityManager;
import joaninha.dao.exceptions.NonexistentEntityException;
import joaninha.modelos.LogOff;

/**
 *
 * @author rafael.lopes
 */
public class LogOffJpaController implements Serializable {

    public void edit(LogOff logOff) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = ConnectionFactory.em();
            em.getTransaction().begin();
            logOff = em.merge(logOff);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = logOff.getId();
                if (findLogOff(id) == null) {
                    throw new NonexistentEntityException("The logOff with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public LogOff findLogOff(Integer id) {
        EntityManager em = ConnectionFactory.em();
        try {
            return em.find(LogOff.class, id);
        } finally {
            em.close();
        }
    }

    public Boolean booleanLogOff(Integer id) {
        EntityManager em = ConnectionFactory.em();
        try {
            return em.find(LogOff.class, id).getLogOff();
        } finally {
            em.close();
        }
    }

}
