package br.com.zupacademy.hugo.transacao.controller;

import br.com.zupacademy.hugo.transacao.model.Cartao;
import br.com.zupacademy.hugo.transacao.model.Transactions;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class TransacaoController {

    @GetMapping
    public ResponseEntity<?> solicitaGerarTransacao(Transactions transactions){

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:7777/api/cartoes";

        Cartao cartao = new Cartao(UUID.randomUUID().toString(), "hugo@zup.com.br");

        Cartao cartaoRecebido = restTemplate.postForObject(url, cartao, Cartao.class);

        return ResponseEntity.ok(cartaoRecebido);

    }

}
