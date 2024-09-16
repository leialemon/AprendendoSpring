package ada.tech.hello.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Emprestimo {
    private String devedor;
    private String credor;
    private BigDecimal valor;
}
