package semana14.Exercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class ContaTest {

@Test 
    public void testCodigoComValorPositivo(){
        Conta conta = new Conta(68795045,0.0,"Yukito");
            conta.Depositar(560.0);

        assertEquals(68795045,conta.getCodigo());
        }

@Test 
    public void testCorrentistaComValorValido(){
        Conta conta = new Conta(68795045,0.0,"Yukito");
        assertEquals("Yukito",conta.getCorrentista());
        }

@Test
     public void testCodigoComValorNegativo(){
            
        assertThrows(RuntimeException.class, () -> {
         new Conta(-68795045,0.0,"Yukito");
            });
 }

 @Test
     public void testCorrentistaComValorMenorQue5(){
            
        assertThrows(RuntimeException.class, () -> {
         new Conta(68795045,0.0,"Yuki");
            });
 }

 @Test
    public void testCorrentistaComValorMaiorQue100(){
        assertThrows(RuntimeException.class, () -> {
            new Conta(68795045,0.0,"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
               });
    }
@Test 
    public void testDepositarComValorValido(){
        Conta conta = new Conta(46757,0.0,"Wakey");
        conta.Depositar(540.0);

        assertEquals(540.0,conta.getSaldo());
    }

@Test 
    public void testSacarComValorValido(){
        Conta conta = new Conta(46757,0.0,"Wakey");
        conta.Depositar(540.0);
        conta.Sacar(500.0);

        assertEquals(40.0,conta.getSaldo());
    }

@Test 
    public void testDepositarComValorInvalido(){
        Conta conta = new Conta(46757,0.0,"Wakey");
        conta.Depositar(540.0);
        assertThrows(RuntimeException.class, () -> {
            conta.Depositar(0.0);
               });
    }

@Test 
    public void testSacarComValorMaiorDoQueSaldo(){
        Conta conta = new Conta(46757,0.0,"Wakey");
        conta.Depositar(540.0);
        assertThrows(RuntimeException.class, () -> {
            conta.Sacar(600.0);
               });
    }

@Test 
    public void testSacarComValorNulo(){
        Conta conta = new Conta(46757,0.0,"Wakey");
        conta.Depositar(540.0);
        assertThrows(RuntimeException.class, () -> {
            conta.Sacar(0.0);
               });
    }

    @Test
    public void testTransferirComValorValido(){
       Conta c1 = new Conta (39485,589.0,"Aurélio");
       Conta destino = new Conta (98594,678.0,"Annie");
       
       c1.Transferir(200.0,destino);

       assertEquals(389.0,c1.getSaldo());
       assertEquals(878.0,destino.getSaldo());
    }

    @Test
    public void testTransferirComValorInvalido(){
       Conta c1 = new Conta (39485,589.0,"Aurélio");
       Conta destino = new Conta (98594,678.0,"Annie");
       
       assertThrows(RuntimeException.class, () -> {
        c1.Transferir(700.0,destino);
           });
    }

}


    