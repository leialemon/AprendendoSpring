package ada.tech.hello.Controller;

import ada.tech.hello.model.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

@Controller
public class EmprestimoController {

    @RequestMapping("emprestimo")
    @ResponseBody
    public Emprestimo mostrarEmprestimo(){
        Emprestimo divida = new Emprestimo();
        divida.setCredor("Silvio Santos");
        divida.setDevedor("Elon Musk");
        divida.setValor(BigDecimal.valueOf(2.00));
        return divida;
    }
}
