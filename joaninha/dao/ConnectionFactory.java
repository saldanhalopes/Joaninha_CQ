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

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rafael.lopes
 */
public class ConnectionFactory {

    private static final ThreadLocal<EntityManager> threadLocal = new ThreadLocal<>();
    private static EntityManagerFactory factory;

    /**
     * Cria uma entity manager factory única e o retorna em todas as demais
     * chamadas
     */
    public static EntityManagerFactory getFactory() {
        if (factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory("JoaninhaPU");
        }
        return factory;
    }

    /**
     * Cria um entity manager único (se criar = true) para a thread e o retorna
     * em todas as demais chamadas
     */
    public static EntityManager em(boolean criar) {
        EntityManager em = (EntityManager) threadLocal.get();
        if (em == null || !em.isOpen()) {
            if (criar) {
                em = getFactory().createEntityManager();
                threadLocal.set(em);
            }
        }
        return em;
    }

    /**
     * Cria um entity manager único para a thread e o retorna em todas as demais
     * chamadas
     */
    public static EntityManager em() {
        return em(true);
    }
    
    
}
