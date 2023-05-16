package semana12.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
@Test
    public void testcalcularImc(){
        Pessoa pessoa = new Pessoa(1.90,85.0);
       
        double imc = pessoa.calcularImc();

        assertEquals(23.545706371191137,imc);
    }
@Test
    public void testgetFaixa (){
        Pessoa pessoa = new Pessoa(1.75,58.0);
        
        double imc = pessoa.calcularImc();

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Peso normal",classificacao);
    }
@Test 
     public void testgetSituacao (){
        Pessoa pessoa = new Pessoa(1.85,105.0);

        double imc = pessoa.calcularImc();

        String situacao = pessoa.getSituacao(imc);

        assertEquals("PERDER",situacao);
     }
    
}
