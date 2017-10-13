package br.com.gravata.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * criado por bruno em 12/10/17.
 */
@Entity
@Table(name = "tb_pagamentos")
public class Pagamento extends EntidadeAbstrata{

    private Integer id;
    private LocalDateTime dataPagamento;
    private BigDecimal valorPago;
    private Date dataExpiracao;
    private Usuario usuario;

    public Pagamento() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "dt_pagamento",nullable = false)
    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Column(name = "vl_pago",nullable = false)
    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_expiracao",nullable = false)
    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario",nullable = false)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
