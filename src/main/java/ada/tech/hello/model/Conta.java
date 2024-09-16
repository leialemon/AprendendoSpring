package ada.tech.hello.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.math.BigDecimal;

@Getter
@Setter
public class Conta {
    private BigDecimal saldo;
    private List<Transacao> historico;
    private String nomeTitular;
    private String cpfTitular;
    private int numero;
}
