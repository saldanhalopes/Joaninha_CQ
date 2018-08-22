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
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rafael.lopes
 */
@Entity
@Table(name = "tb_produto")
public class Produto implements EntidadeBase, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cod_produto", nullable = false, length = 250, unique = true)
    private String codProduto;

    @Column(name = "nome_produto", nullable = false, length = 250)
    private String nomeProduto;

    @Column(name = "tipo_produto", nullable = false, length = 250)
    private String tipoProduto;

    @ManyToOne()
    @JoinColumn(name = "metodologia_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_metodologia_produto"))
    private Metodologia metodo;

    public Produto() {
    }

    public Produto(Integer id) {
        this.id = id;
    }

    public Produto(String codProduto, String nomeProduto, String tipoProduto, Metodologia metodo) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.metodo = metodo;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Metodologia getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodologia metodo) {
        this.metodo = metodo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Produto other = (Produto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", tipoProduto=" + tipoProduto + ", metodo=" + metodo + '}';
    }

    
}
