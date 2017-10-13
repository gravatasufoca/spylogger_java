package br.com.gravata.vo;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;

/**
 * Created by bruno on 02/12/16.
 */

public class AparelhoVO implements Serializable {

    private Integer id;
    private String nome;
    private String chave;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    @JsonSetter("no_aparelho")
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChave() {
        return chave;
    }

    @JsonSetter("ds_chave")
    public void setChave(String chave) {
        this.chave = chave;
    }
}
