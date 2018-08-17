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
package joaninha.view.teste;

import java.util.Date;
import javax.persistence.EntityManagerFactory;
import joaninha.dao.EquipesJpaController;
import joaninha.dao.UsersJpaController;
import joaninha.modelos.Equipes;
import joaninha.modelos.Users;
import joaninha.util.Cript;
import joaninha.util.DataHora;
import joaninha.util.Sistema;

/**
 *
 * @author rafael.lopes
 */
public class teste {

    private static EntityManagerFactory factory;

    public static void main(String[] args) {

//        factory = Persistence.createEntityManagerFactory("JoaninhaPU");
//        EntityManager em = factory.createEntityManager();
//        Users users = new Users();
//        users.setUserName("rlopes");
//        users.setPassword(Cript.md5("123"));

//         create new
//        em.getTransaction().begin();
//        em.persist(equipes);
//        em.getTransaction().commit();
//
//        em.close();
//        try {
//            LoginJpaController logindao = new LoginJpaController();
//            EquipesJpaController dao = new EquipesJpaController();
//            for (Equipes equipe : dao.findEquipesEntities()) {
//                System.out.println(equipe.getEquipeId());
//            }
//            System.out.println(logindao.checkLogin(users));
//
//        } catch (Exception e) {
//
//        }
        try {
            Equipes equipes = new Equipes();
            EquipesJpaController userDao = new EquipesJpaController();
            equipes.setNomeEquipe("admin");
            equipes.setSystemName(123);
            equipes.setEquipeId(2);
            equipes.setUserEquipamento("admin");
            //equipes.setDataRegistro(DataHora.getTimestampDate(new Date()));
//            user.setUserId(userDao.getUserByUserName(user).getUserId());
//            System.out.println(user);
//            equipes.setUserId(277);
//            equipes.setComputador(Sistema.getComputador());
            //user.setLastLogin(DataHora.getTimestampDate(new Date()));
//            equipes.setUserComputador(System.getProperty("user.name"));
//            equipes.setFailedAccessCount(0);
            userDao.edit(equipes);
        } catch (Exception e) {

        }

    }

}
