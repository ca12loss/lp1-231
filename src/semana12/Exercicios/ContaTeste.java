package semana12.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
    @Test
    public void testSacar(){
        Conta conta = new Conta(23495,890.0,"Ananda");
        double saque = conta.Sacar(89.5);

        assertEquals(800.5,saque);
    }

}
