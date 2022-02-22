import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {
    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService bonusService = new BonusService();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                bonusService.calcularBonus(new Funcionario("Funcionário Teste",
                        LocalDate.now(), new BigDecimal("25000"))));

        //fazendo usando o try e catch
       /* try {
        bonusService.calcularBonus(new Funcionario("Funcionário Teste",
                LocalDate.now(), new BigDecimal("25000")));
        fail("Não entrou na exceção");
        } catch (Exception exception) {
           assertEquals("Funcionário com valor acima do permitido para receber bonus!");

        }*/
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Funcionário Teste", LocalDate.now(), new BigDecimal("2500")));

        Assertions.assertEquals(new BigDecimal("250.00"), bonus);

    }

    @Test
    void bonusDeveriaSer10PorCentoParaSalarioDeExatamente10Mil() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Funcionário Teste", LocalDate.now(), new BigDecimal("10000")));

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);

    }


}



