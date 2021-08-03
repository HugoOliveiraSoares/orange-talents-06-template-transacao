package br.com.zupacademy.hugo.transacao.controller.form;

import br.com.zupacademy.hugo.transacao.model.Cartao;

public class CartaoFORM {

    private String id;
    private String email;

    @Deprecated
    public CartaoFORM() {
    }

    public CartaoFORM(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Cartao toModel() {
        return new Cartao(getId(), getEmail());
    }
}
