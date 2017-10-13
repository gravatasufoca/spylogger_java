package br.com.gravata.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_arquivo")
public class Arquivo extends EntidadeAbstrata{

    private Integer id;
    private LocalDateTime dataCriacao;
    private String duracao;
    private Aparelho aparelho;
    private TipoMidia tipoMidia;

    public Arquivo() {
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

    @Column(name = "vl_duracao")
    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aparelho",nullable = false)
    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_midia",nullable = false)
    public TipoMidia getTipoMidia() {
        return tipoMidia;
    }

    public void setTipoMidia(TipoMidia tipoMidia) {
        this.tipoMidia = tipoMidia;
    }
}
