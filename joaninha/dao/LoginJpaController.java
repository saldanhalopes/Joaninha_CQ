/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joaninha.dao;

//import Classes.BancoDados.ConnectionFactory;
import joaninha.modelos.Users;
import joaninha.util.DataHora;
import java.sql.SQLException;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rafael
 */
public class LoginJpaController {


//
//    public void create(Setor setor) throws PreexistingEntityException, Exception {
//        EntityManager em = null;
//        try {
//            em = getEntityManager();
//            em.getTransaction().begin();
//            em.persist(setor);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            if (findSetor(setor.getSetorId()) != null) {
//                throw new PreexistingEntityException("Setor " + setor + " already exists.", ex);
//            }
//            throw ex;
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//    }
//
//    public void edit(Setor setor) throws NonexistentEntityException, Exception {
//        EntityManager em = null;
//        try {
//            em = getEntityManager();
//            em.getTransaction().begin();
//            setor = em.merge(setor);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            String msg = ex.getLocalizedMessage();
//            if (msg == null || msg.length() == 0) {
//                Integer id = setor.getSetorId();
//                if (findSetor(id) == null) {
//                    throw new NonexistentEntityException("The setor with id " + id + " no longer exists.");
//                }
//            }
//            throw ex;
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//    }
//
//    public void destroy(Integer id) throws NonexistentEntityException {
//        EntityManager em = null;
//        try {
//            em = getEntityManager();
//            em.getTransaction().begin();
//            Setor setor;
//            try {
//                setor = em.getReference(Setor.class, id);
//                setor.getSetorId();
//            } catch (EntityNotFoundException enfe) {
//                throw new NonexistentEntityException("The setor with id " + id + " no longer exists.", enfe);
//            }
//            em.remove(setor);
//            em.getTransaction().commit();
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//    }
//
//    public List<Setor> findSetorEntities() {
//        return findSetorEntities(true, -1, -1);
//    }
//
//    public List<Setor> findSetorEntities(int maxResults, int firstResult) {
//        return findSetorEntities(false, maxResults, firstResult);
//    }
//
//    private List<Setor> findSetorEntities(boolean all, int maxResults, int firstResult) {
//        EntityManager em = getEntityManager();
//        try {
//            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
//            cq.select(cq.from(Setor.class));
//            Query q = em.createQuery(cq);
//            if (!all) {
//                q.setMaxResults(maxResults);
//                q.setFirstResult(firstResult);
//            }
//            return q.getResultList();
//        } finally {
//            em.close();
//        }
//    }
//
//    public Setor findSetor(Integer id) {
//        EntityManager em = getEntityManager();
//        try {
//            return em.find(Setor.class, id);
//        } finally {
//            em.close();
//        }
//    }
//
//    public int getSetorCount() {
//        EntityManager em = getEntityManager();
//        try {
//            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
//            Root<Setor> rt = cq.from(Setor.class);
//            cq.select(em.getCriteriaBuilder().count(rt));
//            Query q = em.createQuery(cq);
//            return ((Long) q.getSingleResult()).intValue();
//        } finally {
//            em.close();
//        }
//    }
//    
//    
//    

    public int checkLogin(final Users user) throws Exception {
        int check = 0;
        try {
            UsersJpaController dao = new UsersJpaController();
            Users usuario = dao.getUser(user);
            if (usuario != null) {
                System.setProperty("user_id", Integer.toString(usuario.getUserId()));
                System.setProperty("user", usuario.getUserName());
                //System.setProperty("acesso", stringAcesso(usuario.getGroupId()));
                if (usuario.getLocked() == 0) {
                    if (usuario.getChangePassword() == 0) {
                        check = 1;
                    } else {
                        check = 2;
                    }
                    usuario.setLastLogin(DataHora.getTimestampDate(new Date()));
                    dao.edit(usuario);
                } else {
                    check = 3;
                }
            } else {
                check = 4;
            }
        } catch (SQLException ex) {
            LogErroJpaController logErroDAO = new LogErroJpaController();
            logErroDAO.logSQLException(ex, "checkLogin");
        } 
        return check;
    }

//    public boolean selectUserLogin(Usuario user) {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        boolean usuario = false;
//        try {
//            stmt = conn.prepareStatement("SELECT TOP(1) user_name, password FROM tb_users "
//                    + "Where user_name = ? AND password = ? ");
//            stmt.setString(1, user.getUser());
//            stmt.setString(2, user.getPass());
//            rs = stmt.executeQuery();
//            if (rs != null) {
//                while (rs.next()) {
//                    usuario = user.getUser().equals(rs.getString("user_name"))
//                            && user.getPass().equals(rs.getString("password"));
//                }
//            }
//        } catch (SQLException ex) {
//            LogDAO logDAO = new LogDAO();
//            logDAO.logSQLException(ex, "selectUserlogin");
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt, rs);
//        }
//        return usuario;
//    }
//
//    public int[] selectUserIDLoginByUserName(Usuario user) {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        int[] users = {0, 0};
//        try {
//            stmt = conn.prepareStatement("SELECT TOP(1) user_id, failed_access_count FROM tb_users "
//                    + "WHERE user_name = ? ");
//            stmt.setString(1, user.getUser());
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                users[0] = rs.getInt("failed_access_count") < 0 ? 0 : rs.getInt("failed_access_count");
//                users[1] = rs.getInt("user_id");
//            }
//        } catch (SQLException ex) {
//            LogDAO logDAO = new LogDAO();
//            logDAO.logSQLException(ex, "selectUserIDLoginByUserName");
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt, rs);
//        }
//        return users;
//    }
//

//
//    public static boolean isBancoDadosConectado() {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        boolean isConnected = false;
//        try {
//            stmt = conn.prepareStatement("SELECT count(*) as db from sys.databases where name = 'db_sys'");
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                isConnected = rs.getInt("db") > 0;
//            }
//        } catch (SQLException | NullPointerException ex) {
//            isConnected = false;
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt, rs);
//        }
//        return isConnected;
//    }
//
//    public void updateUserLogin(String user_id) {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        String computador;
//        try {
//            computador = java.net.InetAddress.getLocalHost().getHostName();
//        } catch (UnknownHostException ex1) {
//            computador = null;
//        }
//        try {
//            stmt = conn.prepareStatement("UPDATE tb_users "
//                    + "SET last_login = ?, computador = ?, user_computador = ? "
//                    + "WHERE user_id = ?");
//            stmt.setTimestamp(1, DataHora.getTimestampDate(new Date()));
//            stmt.setString(2, computador);
//            stmt.setString(3, System.getProperty("user.name"));
//            stmt.setString(4, user_id);
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            LogDAO logDAO = new LogDAO();
//            logDAO.logSQLException(ex, "updateUserLogin");
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt);
//        }
//    }
//
//    public void updateUserLogout(String user_id) {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = conn.prepareStatement("UPDATE tb_users "
//                    + "SET last_logout = ? "
//                    + "WHERE user_id = ?");
//            stmt.setTimestamp(1, DataHora.getTimestampDate(new Date()));
//            stmt.setString(2, user_id);
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            LogDAO logDAO = new LogDAO();
//            logDAO.logSQLException(ex, "updateUserLogout");
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt);
//        }
//    }
//
//    public void updateFalhaAcesso(Usuario user, boolean falha) {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = conn.prepareStatement("UPDATE tb_users "
//                    + "SET failed_access_count = ? "
//                    + "WHERE user_id = ?");
//            int[] count = selectUserIDLoginByUserName(user);
//            stmt.setInt(1, falha ? count[0] + 1 : 0);
//            stmt.setInt(2, count[1]);
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            LogDAO logDAO = new LogDAO();
//            logDAO.logSQLException(ex, "updateFalhaAcesso");
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt);
//        }
//    }
//
//    public void createLogLoginLogout(String status, String user) {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        String computador;
//        try {
//            computador = java.net.InetAddress.getLocalHost().getHostName();
//        } catch (UnknownHostException ex1) {
//            computador = ex1.toString();
//        }
//        try {
//            stmt = conn.prepareStatement("INSERT INTO tb_log_login "
//                    + "(status, data_hora, user_name, computador, user_computador) "
//                    + "VALUES (?,?,?,?,?)");
//            stmt.setString(1, status);
//            stmt.setTimestamp(2, DataHora.getTimestampDate(new Date()));
//            stmt.setString(3, user);
//            stmt.setString(4, computador);
//            stmt.setString(5, System.getProperty("user.name"));
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt);
//        }
//    }
//
//    public List<Log> readLogLoginLogout() {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        List<Log> logs = new ArrayList<>();
//        try {
//            stmt = conn.prepareStatement("SELECT * FROM tb_log_login "
//                    + "ORDER BY tb_log_login.id DESC ");
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                Log log = new Log();
//                log.setLog_id(rs.getInt("id"));
//                log.setStatus(rs.getString("status"));
//                log.setData(rs.getTimestamp("data_hora"));
//                log.setUser(rs.getString("user_name"));
//                log.setComputador(rs.getString("computador"));
//                log.setUser_computador(rs.getString("user_computador"));
//                logs.add(log);
//            }
//        } catch (SQLException ex) {
//            LogDAO logDAO = new LogDAO();
//            logDAO.logSQLException(ex, "readLogLoginLogout");
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt, rs);
//        }
//        return logs;
//    }
//
//    private String stringAcesso(Integer grupo_id) {
//        Connection conn = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        StringBuilder sb = new StringBuilder();
//        try {
//            stmt = conn.prepareStatement("SELECT tb_form.form_id, tb_acesso.acesso "
//                    + "FROM tb_form "
//                    + "INNER JOIN tb_regra_acesso "
//                    + "ON tb_form.form_id = tb_regra_acesso.form_id "
//                    + "INNER JOIN tb_acesso "
//                    + "ON tb_regra_acesso.acesso_id = tb_acesso.acesso_id "
//                    + "WHERE tb_regra_acesso.group_id = ? ");
//            stmt.setInt(1, grupo_id);
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                sb.append(rs.getInt("form_id"));
//                sb.append("-");
//                sb.append(rs.getString("acesso"));
//                sb.append(";");
//            }
//        } catch (SQLException ex) {
//            LogDAO logDAO = new LogDAO();
//            logDAO.logSQLException(ex, "stringAcesso");
//        } finally {
//            ConnectionFactory.closeConection(conn, stmt, rs);
//        }
//        if (sb.toString().isEmpty()) {
//            sb.append("1-Ler;");
//        }
//        return sb.toString();
//    }
}
