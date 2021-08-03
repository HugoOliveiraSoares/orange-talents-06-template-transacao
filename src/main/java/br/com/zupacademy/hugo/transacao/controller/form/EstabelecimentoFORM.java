package br.com.zupacademy.hugo.transacao.controller.form;

import br.com.zupacademy.hugo.transacao.model.Estabelecimento;

public class EstabelecimentoFORM {

    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoFORM() {
    }

    public EstabelecimentoFORM(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(getNome(), getCidade(), getEndereco());
    }
}
