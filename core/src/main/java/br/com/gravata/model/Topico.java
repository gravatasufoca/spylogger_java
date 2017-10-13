package br.com.gravata.model;

import javax.persistence.*;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_topico")
public class Topico extends EntidadeAbstrata{

    private Integer id;
    private Integer idReferencia;
    private String nome;
    private Boolean grupo;
    private TipoMensagemEnum tipoMensagem;
    private Aparelho aparelho;

    public Topico() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "id_referencia",nullable = false)
    public Integer getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Integer idReferencia) {
        this.idReferencia = idReferencia;
    }
    @Column(name = "ds_nome",length = 200)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "fl_grupo",nullable = false)
    public Boolean getGrupo() {
        return grupo;
    }

    public void setGrupo(Boolean grupo) {
        this.grupo = grupo;
    }

    @Column(name = "tp_mensagem",nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public TipoMensagemEnum getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagemEnum tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
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
