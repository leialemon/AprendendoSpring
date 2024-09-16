package ada.tech.hello.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    // precision : quantidade de casa unitárias
    // scale : quantidade de casas decimais
    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "descrição", length = 255)
    private String descricao;

    @Column()
    private LocalDateTime data;
    private TipoTransacao tipo;
}
