package ada.tech.hello.Controller;

import ada.tech.hello.model.Conta;
import ada.tech.hello.model.TipoTransacao;
import ada.tech.hello.model.Transacao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Controller
public class ContaController {

    @RequestMapping("conta")
    @ResponseBody
    public Conta mostrarConta(){
        Conta conta = new Conta();
        conta.setNumero(1111);
        conta.setNomeTitular("Juliana de Barros Ferreira");
        conta.setCpfTitular("111.111.111-69");
        conta.setSaldo(BigDecimal.valueOf(10.00));
        conta.setHistorico(new ArrayList<>());

        Transacao pagamento = new Transacao();
        pagamento.setTipo(TipoTransacao.PAGAMENTO_BOLETO);
        pagamento.setDescricao("Pagamento de contas");
        pagamento.setValor(BigDecimal.valueOf(10));
        pagamento.setData(LocalDateTime.now());
        conta.getHistorico().add(pagamento);

        Transacao salarioB3 = new Transacao();
        salarioB3.setTipo(TipoTransacao.DEPOSITO);
        salarioB3.setData(LocalDateTime.now());
        salarioB3.setDescricao("Pagamento de salário");
        salarioB3.setValor(BigDecimal.valueOf(5000.00));
        conta.getHistorico().add(salarioB3);
        return conta;
    }
}
