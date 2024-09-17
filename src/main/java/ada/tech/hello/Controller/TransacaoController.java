package ada.tech.hello.Controller;

import ada.tech.hello.model.TipoTransacao;
import ada.tech.hello.model.Transacao;
import ada.tech.hello.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Controller
public class TransacaoController {
    @Autowired
    TransacaoRepository repository;

    @RequestMapping("transacao")
    @ResponseBody
    public Transacao mostrarTransacao(){

        //Instanciando transacao
        Transacao transacao = new Transacao();
        transacao.setData(LocalDateTime.now());
        transacao.setDescricao("Dinheeeeiro");
        BigDecimal valor = BigDecimal.valueOf(150.00);
        transacao.setValor(valor);
        transacao.setTipo(TipoTransacao.DEPOSITO);
        //Retornando transacao
        return repository.save(transacao);
    }
}
