package semana12.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
    @Test
    public void testSacar(){
        Conta conta = new Conta(23495,890.0,"Ananda");
        double status = conta.Sacar(75.78);

        assertEquals(814.22,status);
    }
    @Test
    public void testDepositar(){
        Conta conta = new Conta(34658,765.67,"Alice");
        double status = conta.Depositar(1345.78);

        assertEquals(2111.45,status);
    }
    @Test
    public void testTransferir(){
       Conta conta = new Conta (39485,58992.67,"Aurélio");
       double status = conta.Transferir(4567.89,59403);

       assertEquals(54424.78,status);
    }
}
