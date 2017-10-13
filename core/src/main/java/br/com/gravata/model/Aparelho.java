package br.com.gravata.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * criado por bruno em 12/10/17.
 */

@Entity
@Table(name = "tb_aparelho")
public class Aparelho extends EntidadeAbstrata {
    private Integer id;
    private String chave;
    private String nomeAparelho;
    private LocalDateTime dataCriacao;
    private Boolean ativo;
    private Usuario usuario;

    public Aparelho() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "ds_chave",length = 500)
    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Column(name = "no_aparelho",length = 45)
    public String getNomeAparelho() {
        return nomeAparelho;
    }

    public void setNomeAparelho(String nomeAparelho) {
        this.nomeAparelho = nomeAparelho;
    }

    @Column(name = "dt_criacao",nullable = false)
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Column(name = "fl_ativo",nullable = false)
    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario",nullable = false)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aparelho aparelho = (Aparelho) o;

        if (id != null ? !id.equals(aparelho.id) : aparelho.id != null) return false;
        if (chave != null ? !chave.equals(aparelho.chave) : aparelho.chave != null) return false;
        if (ativo != null ? !ativo.equals(aparelho.ativo) : aparelho.ativo != null) return false;
        return usuario != null ? usuario.equals(aparelho.usuario) : aparelho.usuario == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (chave != null ? chave.hashCode() : 0);
        result = 31 * result + (ativo != null ? ativo.hashCode() : 0);
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        return result;
    }
}
