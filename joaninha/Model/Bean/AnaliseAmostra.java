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
@Table(name = "tb_analise_amostra")
public class AnaliseAmostra implements EntidadeBase, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "analise_amostra", nullable = false, length = 250, unique = true)
    private String analiseAmostra;

    @Column(name = "sigla_analise_amostra", nullable = false)
    private String siglaAnaliseAmostra;

    @Column(name = "descricao_analise_amostra")
    private String descricaoAnaliseAmostra;

    public AnaliseAmostra() {
    }

    public AnaliseAmostra(Integer id) {
        this.id = id;
    }

    public AnaliseAmostra(String analiseAmostra, String siglaAnaliseAmostra, String descricaoAnaliseAmostra) {
        this.analiseAmostra = analiseAmostra;
        this.siglaAnaliseAmostra = siglaAnaliseAmostra;
        this.descricaoAnaliseAmostra = descricaoAnaliseAmostra;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnaliseAmostra() {
        return analiseAmostra;
    }

    public void setAnaliseAmostra(String analiseAmostra) {
        this.analiseAmostra = analiseAmostra;
    }

    public String getSiglaAnaliseAmostra() {
        return siglaAnaliseAmostra;
    }

    public void setSiglaAnaliseAmostra(String siglaAnaliseAmostra) {
        this.siglaAnaliseAmostra = siglaAnaliseAmostra;
    }

    public String getDescricaoAnaliseAmostra() {
        return descricaoAnaliseAmostra;
    }

    public void setDescricaoAnaliseAmostra(String descricaoAnaliseAmostra) {
        this.descricaoAnaliseAmostra = descricaoAnaliseAmostra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final AnaliseAmostra other = (AnaliseAmostra) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "AnaliseAmostra{" + "id=" + id + ", analiseAmostra=" + analiseAmostra + ", siglaAnaliseAmostra=" + siglaAnaliseAmostra + ", descricaoAnaliseAmostra=" + descricaoAnaliseAmostra + '}';
    }

}
