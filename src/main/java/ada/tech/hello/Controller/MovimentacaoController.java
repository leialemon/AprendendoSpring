package ada.tech.hello.Controller;

import ada.tech.hello.model.Transacao;
import ada.tech.hello.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovimentacaoController {

    @Autowired
    TransacaoRepository repository;

    @RequestMapping("movimentacao")
    @ResponseBody
    public List<Transacao> mostrarMovimentacao(){
        return repository.findAll();
    }
}
