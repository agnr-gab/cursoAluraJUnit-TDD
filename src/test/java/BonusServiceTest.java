import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {
    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Funcionário Teste", LocalDate.now(),new BigDecimal("25000")));

        Assertions.assertEquals(new BigDecimal("0.00"), bonus);

    }
    @Test
    void bonusDeveriaSer10PorCentoDoSalario(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Funcionário Teste", LocalDate.now(),new BigDecimal("2500")));

        Assertions.assertEquals(new BigDecimal("250.00"), bonus);

    }


}



