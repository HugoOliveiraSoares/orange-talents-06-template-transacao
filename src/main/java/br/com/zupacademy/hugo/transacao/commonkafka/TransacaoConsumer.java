package br.com.zupacademy.hugo.transacao.commonkafka;

import br.com.zupacademy.hugo.transacao.controller.form.TransacoesFORM;
import br.com.zupacademy.hugo.transacao.model.Transacoes;
import br.com.zupacademy.hugo.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoConsumer {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacoesFORM transacoesFORM) {

        Transacoes transacoes = transacoesFORM.toModel();
        
        transacaoRepository.save(transacoes);

    }

}
