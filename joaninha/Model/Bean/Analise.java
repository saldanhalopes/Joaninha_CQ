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
package Joaninha.Model.Bean;

import Joaninha.Interface.EntidadeBase;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rafael.lopes
 */
@Entity
@Table(name = "tb_analise")
public class Analise implements EntidadeBase, Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "analise", nullable = false, length = 250, unique = true)
    private String analise;
    
    @Column(name = "sigla_analise", nullable = false)
    private String siglaAnalise;
    
    @Column(name = "descricao_analise")
    private String descricaoAnalise;

    public Analise() {
    }

    public Analise(Integer id) {
        this.id = id;
    }

    public Analise(String analise, String siglaAnalise, String descricaoAnalise) {
        this.analise = analise;
        this.siglaAnalise = siglaAnalise;
        this.descricaoAnalise = descricaoAnalise;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

    public String getSiglaAnalise() {
        return siglaAnalise;
    }

    public void setSiglaAnalise(String siglaAnalise) {
        this.siglaAnalise = siglaAnalise;
    }

    public String getDescricaoAnalise() {
        return descricaoAnalise;
    }

    public void setDescricaoAnalise(String descricaoAnalise) {
        this.descricaoAnalise = descricaoAnalise;
    }

     @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Analise other = (Analise) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Analise{" + "id=" + id + ", analise=" + analise + ", siglaAnalise=" + siglaAnalise + ", descricaoAnalise=" + descricaoAnalise + '}';
    }

}
