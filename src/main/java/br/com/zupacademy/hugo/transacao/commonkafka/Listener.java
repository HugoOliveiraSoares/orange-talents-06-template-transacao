package br.com.zupacademy.hugo.transacao.commonkafka;

import br.com.zupacademy.hugo.transacao.model.Transactions;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(Transactions transactions) {
        System.out.println("--Transação encontrada--");
        System.out.println(transactions.toString());
    }

}
