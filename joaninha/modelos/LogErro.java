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
@Table(name = "tb_log_erro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogErro.findAll", query = "SELECT l FROM LogErro l"),
    @NamedQuery(name = "LogErro.findByLogId", query = "SELECT l FROM LogErro l WHERE l.logId = :logId"),
    @NamedQuery(name = "LogErro.findByTipo", query = "SELECT l FROM LogErro l WHERE l.tipo = :tipo"),
    @NamedQuery(name = "LogErro.findByClasse", query = "SELECT l FROM LogErro l WHERE l.classe = :classe"),
    @NamedQuery(name = "LogErro.findByData", query = "SELECT l FROM LogErro l WHERE l.data = :data"),
    @NamedQuery(name = "LogErro.findByUserName", query = "SELECT l FROM LogErro l WHERE l.userName = :userName"),
    @NamedQuery(name = "LogErro.findByComputador", query = "SELECT l FROM LogErro l WHERE l.computador = :computador"),
    @NamedQuery(name = "LogErro.findByUserComputador", query = "SELECT l FROM LogErro l WHERE l.userComputador = :userComputador")})
public class LogErro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "log_id")
    private Integer logId;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "classe")
    private String classe;
    @Lob
    @Column(name = "erro")
    private String erro;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "computador")
    private String computador;
    @Column(name = "user_computador")
    private String userComputador;

    public LogErro() {
    }

    public LogErro(Integer logId) {
        this.logId = logId;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
        hash += (logId != null ? logId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogErro)) {
            return false;
        }
        LogErro other = (LogErro) object;
        if ((this.logId == null && other.logId != null) || (this.logId != null && !this.logId.equals(other.logId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "joaninha.modelos.LogErro[ logId=" + logId + " ]";
    }
    
}
