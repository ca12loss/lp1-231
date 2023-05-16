package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
@Test
    public void testcalcularImc(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.90;
        pessoa.peso = 85.0;

        double imc = pessoa.calcularImc();

        assertEquals(23.545706371191137,imc);
    }
@Test
    public void testgetFaixa (){
        Pessoa pessoa = new Pessoa();
        
        double imc = 21.8;

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Peso normal",classificacao);
    }
@Test 
     public void testgetSituacao (){
        Pessoa pessoa = new Pessoa();

        double imc = 28.5;

        String situacao = pessoa.getSituacao(imc);

        assertEquals("PERDER",situacao);
     }
    
}
