package br.com.gravata.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_ligacao")
public class Ligacao extends EntidadeAbstrata {

    private Integer id;
    private Integer idReferencia;
    private LocalDateTime data;
    private String numero;
    private Boolean remetente;
    private String nomeContato;
    private Topico topico;
    private Arquivo arquivo;

    public Ligacao() {
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

    @Column(name = "dt_data",nullable = false)
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Column(name = "nu_numero",length = 45,nullable = false)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Column(name = "fl_remetente",nullable = false)
    public Boolean getRemetente() {
        return remetente;
    }

    public void setRemetente(Boolean remetente) {
        this.remetente = remetente;
    }

    @Column(name = "no_contato",nullable = false)
    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_topico",nullable = false)
    public Topico getTopico() {
        return topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_arquivo",nullable = false)
    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }
}
