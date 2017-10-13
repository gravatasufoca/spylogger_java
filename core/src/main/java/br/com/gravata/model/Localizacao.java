package br.com.gravata.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_localizacoes")
public class Localizacao extends EntidadeAbstrata {

    private Integer id;
    private LocalDateTime dataCriacao;
    private String latitude;
    private String longitude;
    private BigDecimal precisao;
    private Aparelho aparelho;

    public Localizacao() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "dt_criacao",nullable = false)
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Column(name = "vl_latitude",length = 45)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Column(name = "vl_longitude",length = 45)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Column(name = "vl_precisao")
    public BigDecimal getPrecisao() {
        return precisao;
    }

    public void setPrecisao(BigDecimal precisao) {
        this.precisao = precisao;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aparelho",nullable = false)
    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }
}
