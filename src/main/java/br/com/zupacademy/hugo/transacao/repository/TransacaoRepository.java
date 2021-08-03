package br.com.zupacademy.hugo.transacao.repository;

import br.com.zupacademy.hugo.transacao.model.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacoes, String> {

    @Query(value = "SELECT * FROM Transacoes t WHERE t.cartao_id = :id ORDER BY t.id DESC LIMIT 10",
    nativeQuery = true)
    List<Transacoes> find10UltimasCompras(String id);

}
