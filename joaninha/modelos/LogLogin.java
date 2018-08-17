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
@Table(name = "tb_log_login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogLogin.findAll", query = "SELECT l FROM LogLogin l"),
    @NamedQuery(name = "LogLogin.findById", query = "SELECT l FROM LogLogin l WHERE l.id = :id"),
    @NamedQuery(name = "LogLogin.findByStatus", query = "SELECT l FROM LogLogin l WHERE l.status = :status"),
    @NamedQuery(name = "LogLogin.findByDataHora", query = "SELECT l FROM LogLogin l WHERE l.dataHora = :dataHora"),
    @NamedQuery(name = "LogLogin.findByUserName", query = "SELECT l FROM LogLogin l WHERE l.userName = :userName"),
    @NamedQuery(name = "LogLogin.findByComputador", query = "SELECT l FROM LogLogin l WHERE l.computador = :computador"),
    @NamedQuery(name = "LogLogin.findByUserComputador", query = "SELECT l FROM LogLogin l WHERE l.userComputador = :userComputador")})
public class LogLogin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "status")
    private String status;
    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "computador")
    private String computador;
    @Column(name = "user_computador")
    private String userComputador;

    public LogLogin() {
    }

    public LogLogin(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogLogin)) {
            return false;
        }
        LogLogin other = (LogLogin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "joaninha.modelos.LogLogin[ id=" + id + " ]";
    }
    
}
