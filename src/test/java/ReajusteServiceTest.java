import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Teste de Funcionario", LocalDate.now(),
                new BigDecimal("1000"));

        service.concenderReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

}
