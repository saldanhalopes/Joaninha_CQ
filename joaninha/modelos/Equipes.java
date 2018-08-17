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
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tb_equipes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipes.findAll", query = "SELECT e FROM Equipes e"),
    @NamedQuery(name = "Equipes.findByEquipeId", query = "SELECT e FROM Equipes e WHERE e.equipeId = :equipeId"),
    @NamedQuery(name = "Equipes.findBySystemName", query = "SELECT e FROM Equipes e WHERE e.systemName = :systemName"),
    @NamedQuery(name = "Equipes.findByNomeEquipe", query = "SELECT e FROM Equipes e WHERE e.nomeEquipe = :nomeEquipe"),
    @NamedQuery(name = "Equipes.findByTurno", query = "SELECT e FROM Equipes e WHERE e.turno = :turno"),
    @NamedQuery(name = "Equipes.findByUserEquipamento", query = "SELECT e FROM Equipes e WHERE e.userEquipamento = :userEquipamento"),
    @NamedQuery(name = "Equipes.findByUserPreparo", query = "SELECT e FROM Equipes e WHERE e.userPreparo = :userPreparo"),
    @NamedQuery(name = "Equipes.findByDataRegistro", query = "SELECT e FROM Equipes e WHERE e.dataRegistro = :dataRegistro"),
    @NamedQuery(name = "Equipes.findByUserRegistro", query = "SELECT e FROM Equipes e WHERE e.userRegistro = :userRegistro")})
public class Equipes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipe_id")
    private Integer equipeId;
    @Column(name = "system_name")
    private Integer systemName;
    @Column(name = "nome_equipe")
    private String nomeEquipe;
    @Column(name = "turno")
    private String turno;
    @Column(name = "user_equipamento")
    private String userEquipamento;
    @Column(name = "user_preparo")
    private String userPreparo;
    @Column(name = "data_registro", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataRegistro;
    @Column(name = "user_registro")
    private String userRegistro;

    public Equipes() {
    }

    public Equipes(Integer equipeId) {
        this.equipeId = equipeId;
    }

    public Integer getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(Integer equipeId) {
        this.equipeId = equipeId;
    }

    public Integer getSystemName() {
        return systemName;
    }

    public void setSystemName(Integer systemName) {
        this.systemName = systemName;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getUserEquipamento() {
        return userEquipamento;
    }

    public void setUserEquipamento(String userEquipamento) {
        this.userEquipamento = userEquipamento;
    }

    public String getUserPreparo() {
        return userPreparo;
    }

    public void setUserPreparo(String userPreparo) {
        this.userPreparo = userPreparo;
    }

    public Timestamp getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Timestamp dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getUserRegistro() {
        return userRegistro;
    }

    public void setUserRegistro(String userRegistro) {
        this.userRegistro = userRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipeId != null ? equipeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipes)) {
            return false;
        }
        Equipes other = (Equipes) object;
        if ((this.equipeId == null && other.equipeId != null) || (this.equipeId != null && !this.equipeId.equals(other.equipeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "joaninha.modelos.Equipes[ equipeId=" + equipeId + " ]";
    }
    
}
