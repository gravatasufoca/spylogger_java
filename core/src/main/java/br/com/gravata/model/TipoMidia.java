package br.com.gravata.model;

import javax.persistence.*;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_tipo_midia")
public class TipoMidia  extends EntidadeAbstrata{

    private Integer id;
    private String descricao;

    public TipoMidia() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "ds_tipo")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
