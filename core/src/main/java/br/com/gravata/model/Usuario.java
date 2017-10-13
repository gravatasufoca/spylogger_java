package br.com.gravata.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * criado por bruno em 12/10/17.
 */

@Entity
@Table(name = "tb_usuario")
public class Usuario extends EntidadeAbstrata{

    private Integer id;
    private String email;
    private String senha;
    private LocalDateTime dataCriacao;
    private Boolean ativo;
    private Boolean master;

    public Usuario() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "ds_email",length = 100,nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "ds_senha",length = 100,nullable = false)
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    @Column(name = "fl_master",nullable = false)
    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Usuario usuario = (Usuario) o;

        if (id != null ? !id.equals(usuario.id) : usuario.id != null) return false;
        if (email != null ? !email.equals(usuario.email) : usuario.email != null) return false;
        if (senha != null ? !senha.equals(usuario.senha) : usuario.senha != null) return false;
        return ativo != null ? ativo.equals(usuario.ativo) : usuario.ativo == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (senha != null ? senha.hashCode() : 0);
        result = 31 * result + (ativo != null ? ativo.hashCode() : 0);
        return result;
    }
}
