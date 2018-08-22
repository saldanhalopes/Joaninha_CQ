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
@Table(name = "tb_metodologia")
public class Metodologia implements EntidadeBase, Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "cod_metodo", nullable = false, length = 250, unique = true)
    private String codMetodo;
    
    @Column(name = "nome_metodo", nullable = false, length = 250)
    private String nomeMetodo;
    
    @Column(name = "categoria_metodo", nullable = true, length = 250)
    private String categoriaMetodo;
    
    @Column(name = "versao_metodo", nullable = true)
    private Integer versaoMetodo;
    
    @Column(name = "link_metodo", nullable = false, length = 250)
    private String linkMetodo;
    
    @Column(name = "ajuda_metodo")
    private Boolean ajudaMetodo;

    public Metodologia() {
    }

    public Metodologia(Integer id) {
        this.id = id;
    }

    public Metodologia(String codMetodo, String categoriaMetodo, Integer versaoMetodo, String linkMetodo) {
        this.codMetodo = codMetodo;
        this.categoriaMetodo = categoriaMetodo;
        this.versaoMetodo = versaoMetodo;
        this.linkMetodo = linkMetodo;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodMetodo() {
        return codMetodo;
    }

    public void setCodMetodo(String codMetodo) {
        this.codMetodo = codMetodo;
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    public String getCategoriaMetodo() {
        return categoriaMetodo;
    }

    public void setCategoriaMetodo(String categoriaMetodo) {
        this.categoriaMetodo = categoriaMetodo;
    }

    public Integer getVersaoMetodo() {
        return versaoMetodo;
    }

    public void setVersaoMetodo(Integer versaoMetodo) {
        this.versaoMetodo = versaoMetodo;
    }

    public String getLinkMetodo() {
        return linkMetodo;
    }

    public void setLinkMetodo(String linkMetodo) {
        this.linkMetodo = linkMetodo;
    }

    public Boolean getAjudaMetodo() {
        return ajudaMetodo;
    }

    public void setAjudaMetodo(Boolean ajudaMetodo) {
        this.ajudaMetodo = ajudaMetodo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Metodologia other = (Metodologia) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Metodologia{" + "id=" + id + ", codMetodo=" + codMetodo + ", nomeMetodo=" + nomeMetodo + ", categoriaMetodo=" + categoriaMetodo + ", versaoMetodo=" + versaoMetodo + ", linkMetodo=" + linkMetodo + ", ajudaMetodo=" + ajudaMetodo + '}';
    }

}
