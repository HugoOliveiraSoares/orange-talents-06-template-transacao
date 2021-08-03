package br.com.zupacademy.hugo.transacao.controller.dto;

import br.com.zupacademy.hugo.transacao.model.Estabelecimento;

public class EstabelecimentoDTO {

    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoDTO() {
    }

    public EstabelecimentoDTO(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
        this.endereco = estabelecimento.getEndereco();
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

}
