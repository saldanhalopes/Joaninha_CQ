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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rafael.lopes
 */
@Entity
@Table(name = "tb_setor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Setor.findAll", query = "SELECT s FROM Setor s"),
    @NamedQuery(name = "Setor.findBySetorId", query = "SELECT s FROM Setor s WHERE s.setorId = :setorId"),
    @NamedQuery(name = "Setor.findBySetor", query = "SELECT s FROM Setor s WHERE s.setor = :setor"),
    @NamedQuery(name = "Setor.findBySiglaSetor", query = "SELECT s FROM Setor s WHERE s.siglaSetor = :siglaSetor"),
    @NamedQuery(name = "Setor.findByDescricaoSetor", query = "SELECT s FROM Setor s WHERE s.descricaoSetor = :descricaoSetor")})
public class Setor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "setor_id")
    private Integer setorId;
    @Column(name = "setor")
    private String setor;
    @Column(name = "sigla_setor")
    private String siglaSetor;
    @Column(name = "descricao_setor")
    private String descricaoSetor;

    public Setor() {
    }

    public Setor(Integer setorId) {
        this.setorId = setorId;
    }

    public Integer getSetorId() {
        return setorId;
    }

    public void setSetorId(Integer setorId) {
        this.setorId = setorId;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSiglaSetor() {
        return siglaSetor;
    }

    public void setSiglaSetor(String siglaSetor) {
        this.siglaSetor = siglaSetor;
    }

    public String getDescricaoSetor() {
        return descricaoSetor;
    }

    public void setDescricaoSetor(String descricaoSetor) {
        this.descricaoSetor = descricaoSetor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (setorId != null ? setorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setor)) {
            return false;
        }
        Setor other = (Setor) object;
        if ((this.setorId == null && other.setorId != null) || (this.setorId != null && !this.setorId.equals(other.setorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "joaninha.modelos.Setor[ setorId=" + setorId + " ]";
    }
    
}
