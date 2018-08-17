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
@Table(name = "tb_log_sistema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogSistema.findAll", query = "SELECT l FROM LogSistema l"),
    @NamedQuery(name = "LogSistema.findByLogSistemaId", query = "SELECT l FROM LogSistema l WHERE l.logSistemaId = :logSistemaId"),
    @NamedQuery(name = "LogSistema.findBySistemaNome", query = "SELECT l FROM LogSistema l WHERE l.sistemaNome = :sistemaNome"),
    @NamedQuery(name = "LogSistema.findBySistemaData", query = "SELECT l FROM LogSistema l WHERE l.sistemaData = :sistemaData"),
    @NamedQuery(name = "LogSistema.findBySistemaCriador", query = "SELECT l FROM LogSistema l WHERE l.sistemaCriador = :sistemaCriador"),
    @NamedQuery(name = "LogSistema.findBySistemaVersao", query = "SELECT l FROM LogSistema l WHERE l.sistemaVersao = :sistemaVersao")})
public class LogSistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "log_sistema_id")
    private Integer logSistemaId;
    @Column(name = "sistema_nome")
    private String sistemaNome;
    @Column(name = "sistema_data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sistemaData;
    @Column(name = "sistema_criador")
    private String sistemaCriador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "sistema_versao")
    private Double sistemaVersao;

    public LogSistema() {
    }

    public LogSistema(Integer logSistemaId) {
        this.logSistemaId = logSistemaId;
    }

    public Integer getLogSistemaId() {
        return logSistemaId;
    }

    public void setLogSistemaId(Integer logSistemaId) {
        this.logSistemaId = logSistemaId;
    }

    public String getSistemaNome() {
        return sistemaNome;
    }

    public void setSistemaNome(String sistemaNome) {
        this.sistemaNome = sistemaNome;
    }

    public Date getSistemaData() {
        return sistemaData;
    }

    public void setSistemaData(Date sistemaData) {
        this.sistemaData = sistemaData;
    }

    public String getSistemaCriador() {
        return sistemaCriador;
    }

    public void setSistemaCriador(String sistemaCriador) {
        this.sistemaCriador = sistemaCriador;
    }

    public Double getSistemaVersao() {
        return sistemaVersao;
    }

    public void setSistemaVersao(Double sistemaVersao) {
        this.sistemaVersao = sistemaVersao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logSistemaId != null ? logSistemaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogSistema)) {
            return false;
        }
        LogSistema other = (LogSistema) object;
        if ((this.logSistemaId == null && other.logSistemaId != null) || (this.logSistemaId != null && !this.logSistemaId.equals(other.logSistemaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "joaninha.modelos.LogSistema[ logSistemaId=" + logSistemaId + " ]";
    }
    
}
