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
       Conta c1 = new Conta (39485,589.0,"Aurélio");
       Conta destino = new Conta (98594,678.0,"Annie");
       
       c1.Transferir(200.0,destino);

       assertEquals(389.0,c1.saldo);
       assertEquals(878.0,destino.saldo);
    }
}
