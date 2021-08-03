package br.com.zupacademy.hugo.transacao.controller;

import br.com.zupacademy.hugo.transacao.controller.dto.TransacoesDTO;
import br.com.zupacademy.hugo.transacao.model.Transacoes;
import br.com.zupacademy.hugo.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/{id}")
    public ResponseEntity<?> buscaComprasRecentes(@PathVariable String id){

        List<TransacoesDTO> ultimasComprasDTO = new ArrayList<>();

        List<Transacoes> ultimasCompras = transacaoRepository.find10UltimasCompras(id);
        if (ultimasCompras.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        ultimasCompras.forEach( ultimaCompra -> ultimasComprasDTO.add(new TransacoesDTO(ultimaCompra)) );

        return ResponseEntity.ok(ultimasComprasDTO);

    }

}
