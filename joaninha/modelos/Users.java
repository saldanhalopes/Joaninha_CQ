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
package joaninha.modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rafael.lopes
 */
@Entity
@Table(name = "tb_users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserId", query = "SELECT u FROM Users u WHERE u.userId = :userId"),
    @NamedQuery(name = "Users.findByUserName", query = "SELECT u FROM Users u WHERE u.userName = :userName"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByName", query = "SELECT u FROM Users u WHERE u.name = :name"),
    @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email"),
    @NamedQuery(name = "Users.findByCreatedDate", query = "SELECT u FROM Users u WHERE u.createdDate = :createdDate"),
    @NamedQuery(name = "Users.findByChangePassword", query = "SELECT u FROM Users u WHERE u.changePassword = :changePassword"),
    @NamedQuery(name = "Users.findByLocked", query = "SELECT u FROM Users u WHERE u.locked = :locked"),
    @NamedQuery(name = "Users.findByLastLogin", query = "SELECT u FROM Users u WHERE u.lastLogin = :lastLogin"),
    @NamedQuery(name = "Users.findByLastLogout", query = "SELECT u FROM Users u WHERE u.lastLogout = :lastLogout"),
    @NamedQuery(name = "Users.findByCracha", query = "SELECT u FROM Users u WHERE u.cracha = :cracha"),
    @NamedQuery(name = "Users.findByComputador", query = "SELECT u FROM Users u WHERE u.computador = :computador"),
    @NamedQuery(name = "Users.findByUserComputador", query = "SELECT u FROM Users u WHERE u.userComputador = :userComputador"),
    @NamedQuery(name = "Users.findByTurno", query = "SELECT u FROM Users u WHERE u.turno = :turno"),
    @NamedQuery(name = "Users.findByGroupId", query = "SELECT u FROM Users u WHERE u.groupId = :groupId"),
    @NamedQuery(name = "Users.findBySetorId", query = "SELECT u FROM Users u WHERE u.setorId = :setorId"),
    @NamedQuery(name = "Users.findUserLogin", query = "Select u FROM Users u WHERE u.userName = :userName AND u.password = :password"),
    @NamedQuery(name = "Users.findFailedAccessCount", query = "SELECT u FROM Users u WHERE u.userName = :userName"),})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "change_password")
    private Integer changePassword;
    @Column(name = "locked")
    private Integer locked;
    @Lob
    @Column(name = "acesso")
    private String acesso;
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Column(name = "last_logout")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogout;
    @Column(name = "cracha")
    private String cracha;
    @Column(name = "computador")
    private String computador;
    @Column(name = "user_computador")
    private String userComputador;
    @Column(name = "failed_access_count")
    private Integer failedAccessCount;
    @Column(name = "turno")
    private String turno;
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "setor_id")
    private Integer setorId;

    public Users() {
    }

    public Users(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getChangePassword() {
        return changePassword;
    }

    public void setChangePassword(Integer changePassword) {
        this.changePassword = changePassword;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastLogout() {
        return lastLogout;
    }

    public void setLastLogout(Date lastLogout) {
        this.lastLogout = lastLogout;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getUserComputador() {
        return userComputador;
    }

    public void setUserComputador(String userComputador) {
        this.userComputador = userComputador;
    }

    public Integer getFailedAccessCount() {
        return failedAccessCount;
    }

    public void setFailedAccessCount(Integer failedAccessCount) {
        this.failedAccessCount = failedAccessCount;
    }


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getSetorId() {
        return setorId;
    }

    public void setSetorId(Integer setorId) {
        this.setorId = setorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "joaninha.modelos.Users[ userId=" + userId + " ]";
    }

}
