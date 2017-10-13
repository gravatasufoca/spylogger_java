package br.com.gravata.model;

import javax.persistence.*;
import java.sql.Blob;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_contato")
public class Contato extends EntidadeAbstrata{

    private Integer id;
    private String nome;
    private String numero;
    private Blob imagem;
    private Aparelho aparelho;

    public Contato() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "no_contato",length = 150)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "nu_contato",length = 20)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Lob
    @Column(name = "raw_data")
    public Blob getImagem() {
        return imagem;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aparelho")
    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Contato contato = (Contato) o;

        if (id != null ? !id.equals(contato.id) : contato.id != null) return false;
        if (nome != null ? !nome.equals(contato.nome) : contato.nome != null) return false;
        if (numero != null ? !numero.equals(contato.numero) : contato.numero != null) return false;
        return aparelho != null ? aparelho.equals(contato.aparelho) : contato.aparelho == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (aparelho != null ? aparelho.hashCode() : 0);
        return result;
    }
}
