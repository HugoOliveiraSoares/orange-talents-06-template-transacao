package br.com.zupacademy.hugo.transacao.controller.dto;

import br.com.zupacademy.hugo.transacao.model.Transacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacoesDTO {

    private String id;
    private BigDecimal valor;
    private EstabelecimentoDTO estabelecimento;
    private CartaoDTO cartao;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacoesDTO() {
    }

    public TransacoesDTO(Transacoes transacoes) {
        this.id = transacoes.getId();
        this.valor = transacoes.getValor();
        this.estabelecimento = new EstabelecimentoDTO(transacoes.getEstabelecimento());
        this.cartao = new CartaoDTO(transacoes.getCartao());
        this.efetivadaEm = transacoes.getEfetivadaEm();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoDTO getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoDTO getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

}
