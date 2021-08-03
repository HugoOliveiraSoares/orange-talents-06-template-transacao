package br.com.zupacademy.hugo.transacao.controller.form;

import br.com.zupacademy.hugo.transacao.model.Transacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacoesFORM {

    private String id;
    private BigDecimal valor;
    private EstabelecimentoFORM estabelecimento;
    private CartaoFORM cartao;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacoesFORM() {
    }

    public TransacoesFORM(String id, BigDecimal valor, EstabelecimentoFORM estabelecimento, CartaoFORM cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoFORM getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoFORM getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Transacoes toModel() {
        return new Transacoes(getId(), getValor(), getEstabelecimento().toModel(), getCartao().toModel(), getEfetivadaEm());
    }
}
