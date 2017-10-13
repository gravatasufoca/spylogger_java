package br.com.gravata.model;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * criado por bruno em 11/10/17.
 */
@Entity
@Table(name = "tb_mensagem")
public class Mensagem extends EntidadeAbstrata {

    private static final long serialVersionUID = 1524247166270684701L;

    private Integer id;
    private Integer idReferencia;
    private Boolean remetente;
    private String texto;
    private LocalDateTime data;
    private LocalDateTime recebida;
    private String mime;
    private String tamanhoArquivo;
    private Boolean carregado;
    private Blob image;

    private Topico topico;
    private TipoMidia tipoMidia;
    private Contato contato;

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

    public void setRemetente(Boolean remetente) {
        this.remetente = remetente;
    }

    @Column(name = "fl_remetente",nullable = false)
    public Boolean getRemetente() {
        return remetente;
    }

    @Column(name = "ds_texto")
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Column(name = "dt_data",nullable = false)
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Column(name = "dt_recebida",nullable = false)
    public LocalDateTime getRecebida() {
        return recebida;
    }

    public void setRecebida(LocalDateTime recebida) {
        this.recebida = recebida;
    }

    @Column(name = "ds_midia_mime")
    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    @Column(name = "vl_tamanho_arquivo")
    public String getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(String tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Column(name = "carregado")
    public Boolean getCarregado() {
        return carregado;
    }

    public void setCarregado(Boolean carregado) {
        this.carregado = carregado;
    }

    @Lob
    @Column(name = "thumb_image")
    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
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
    @JoinColumn(name = "id_tipo_midia",nullable = false)
    public TipoMidia getTipoMidia() {
        return tipoMidia;
    }

    public void setTipoMidia(TipoMidia tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contato",nullable = false)
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
