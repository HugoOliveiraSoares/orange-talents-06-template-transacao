package br.com.zupacademy.hugo.transacao.controller.dto;

import br.com.zupacademy.hugo.transacao.model.Cartao;

public class CartaoDTO {

    private String id;
    private String email;

    @Deprecated
    public CartaoDTO() {
    }

    public CartaoDTO(Cartao cartao) {
        this.id = cartao.getId();
        this.email = cartao.getEmail();
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
