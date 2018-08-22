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
@Table(name = "tb_analise_finalidade")
public class AnaliseFinalidade implements EntidadeBase, Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "analise_finalidade", nullable = false, length = 250, unique = true)
    private String analiseFinalidade;
    
    @Column(name = "sigla_analise_finalidade", nullable = false)
    private String siglaAnaliseFinalidadee;
    
    @Column(name = "descricao_analise_finalidade")
    private String descricaoAnaliseFinalidade;

    public AnaliseFinalidade() {
    }

    public AnaliseFinalidade(Integer id) {
        this.id = id;
    }

    public AnaliseFinalidade(String analiseFinalidade, String siglaAnaliseFinalidadee, String descricaoAnaliseFinalidade) {
        this.analiseFinalidade = analiseFinalidade;
        this.siglaAnaliseFinalidadee = siglaAnaliseFinalidadee;
        this.descricaoAnaliseFinalidade = descricaoAnaliseFinalidade;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnaliseFinalidade() {
        return analiseFinalidade;
    }

    public void setAnaliseFinalidade(String analiseFinalidade) {
        this.analiseFinalidade = analiseFinalidade;
    }

    public String getSiglaAnaliseFinalidadee() {
        return siglaAnaliseFinalidadee;
    }

    public void setSiglaAnaliseFinalidadee(String siglaAnaliseFinalidadee) {
        this.siglaAnaliseFinalidadee = siglaAnaliseFinalidadee;
    }

    public String getDescricaoAnaliseFinalidade() {
        return descricaoAnaliseFinalidade;
    }

    public void setDescricaoAnaliseFinalidade(String descricaoAnaliseFinalidade) {
        this.descricaoAnaliseFinalidade = descricaoAnaliseFinalidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final AnaliseFinalidade other = (AnaliseFinalidade) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "AnaliseFinalidade{" + "id=" + id + ", analiseFinalidade=" + analiseFinalidade + ", siglaAnaliseFinalidadee=" + siglaAnaliseFinalidadee + ", descricaoAnaliseFinalidade=" + descricaoAnaliseFinalidade + '}';
    }

    
    
}
