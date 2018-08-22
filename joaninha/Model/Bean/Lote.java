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
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rafael.lopes
 */
@Entity
@Table(name = "tb_lote")
public class Lote implements EntidadeBase, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "lote_produto", nullable = false, length = 250, unique = true)
    private String loteProduto;

    @Column(name = "lote_data_entrada", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date loteDataEntrada;

    @Column(name = "lote_data_prevista")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loteDataPrevista;

    @Column(name = "lote_status")
    private String loteStatus;

    @Column(name = "lote_etapa")
    private String loteEtapa;

    @Column(name = "lote_obs")
    private String loteObs;

    @Column(name = "data_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_registro;

    @ManyToOne()
    @JoinColumn(name = "usuario_registro_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_usuario_lote"))
    private Usuario usuarioRegistro;

    @ManyToOne()
    @JoinColumn(name = "produto_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_produto_lote"))
    private Produto produto;

    @ManyToOne()
    @JoinColumn(name = "analise_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_analise_lote"))
    private Analise analise;

    @ManyToOne()
    @JoinColumn(name = "metodo_id_1", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_metodo1_lote"))
    private Metodologia metodo1;

    @ManyToOne()
    @JoinColumn(name = "metodo_id_2", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_metodo2_lote"))
    private Metodologia metodo2;

    public Lote() {
    }

    public Lote(Integer id) {
        this.id = id;
    }

    public Lote(String loteProduto, Date loteDataEntrada, Date loteDataPrevista, String loteStatus, String loteEtapa, String loteObs, Date data_registro, Usuario usuarioRegistro, Produto produto, Analise analise, Metodologia metodo1, Metodologia metodo2) {
        this.loteProduto = loteProduto;
        this.loteDataEntrada = loteDataEntrada;
        this.loteDataPrevista = loteDataPrevista;
        this.loteStatus = loteStatus;
        this.loteEtapa = loteEtapa;
        this.loteObs = loteObs;
        this.data_registro = data_registro;
        this.usuarioRegistro = usuarioRegistro;
        this.produto = produto;
        this.analise = analise;
        this.metodo1 = metodo1;
        this.metodo2 = metodo2;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoteProduto() {
        return loteProduto;
    }

    public void setLoteProduto(String loteProduto) {
        this.loteProduto = loteProduto;
    }

    public Date getLoteDataEntrada() {
        return loteDataEntrada;
    }

    public void setLoteDataEntrada(Date loteDataEntrada) {
        this.loteDataEntrada = loteDataEntrada;
    }

    public Date getLoteDataPrevista() {
        return loteDataPrevista;
    }

    public void setLoteDataPrevista(Date loteDataPrevista) {
        this.loteDataPrevista = loteDataPrevista;
    }

    public String getLoteStatus() {
        return loteStatus;
    }

    public void setLoteStatus(String loteStatus) {
        this.loteStatus = loteStatus;
    }

    public String getLoteEtapa() {
        return loteEtapa;
    }

    public void setLoteEtapa(String loteEtapa) {
        this.loteEtapa = loteEtapa;
    }

    public String getLoteObs() {
        return loteObs;
    }

    public void setLoteObs(String loteObs) {
        this.loteObs = loteObs;
    }

    public Date getData_registro() {
        return data_registro;
    }

    public void setData_registro(Date data_registro) {
        this.data_registro = data_registro;
    }

    public Usuario getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Usuario usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Analise getAnalise() {
        return analise;
    }

    public void setAnalise(Analise analise) {
        this.analise = analise;
    }

    public Metodologia getMetodo1() {
        return metodo1;
    }

    public void setMetodo1(Metodologia metodo1) {
        this.metodo1 = metodo1;
    }

    public Metodologia getMetodo2() {
        return metodo2;
    }

    public void setMetodo2(Metodologia metodo2) {
        this.metodo2 = metodo2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Lote other = (Lote) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Lote{" + "id=" + id + ", loteProduto=" + loteProduto + ", loteDataEntrada=" + loteDataEntrada + ", loteDataPrevista=" + loteDataPrevista + ", loteStatus=" + loteStatus + ", loteEtapa=" + loteEtapa + ", loteObs=" + loteObs + ", data_registro=" + data_registro + ", usuarioRegistro=" + usuarioRegistro + ", produto=" + produto + ", analise=" + analise + ", metodo1=" + metodo1 + ", metodo2=" + metodo2 + '}';
    }

}
