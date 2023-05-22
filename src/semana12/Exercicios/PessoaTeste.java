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
    public void testgetFaixaPesoBaixo(){
        Pessoa pessoa = new Pessoa (1.75,47.0);
        double imc = pessoa.calcularImc();

        String faixa = pessoa.getFaixa(imc);

        assertEquals("Peso Baixo",faixa);
    }

    @Test
    public void testgetFaixaPesoNormal (){
        Pessoa pessoa = new Pessoa(1.75,58);
        
        double imc = pessoa.calcularImc();

        String faixa = pessoa.getFaixa(imc);

        assertEquals("Peso normal",faixa);
    }

    @Test
    public void testgetFaixaSobrepeso(){
        Pessoa pessoa = new Pessoa(1.50,60.0);
       
        double imc = pessoa.calcularImc();

        String faixa = pessoa.getFaixa(imc);

        assertEquals("Sobrepeso",faixa);
    }

    @Test
    public void testgetFaixaObesidade1(){
        Pessoa pessoa = new Pessoa(1.50,75.0);
        
        double imc = pessoa.calcularImc();

        String faixa = pessoa.getFaixa(imc);

        assertEquals("Obesidade de Classe 1",faixa);
    }
   
    @Test
    public void testgetFaixaObesidade2(){
        Pessoa pessoa = new Pessoa(1.60,90.0);

        double imc = pessoa.calcularImc();

        String faixa = pessoa.getFaixa(imc);

        assertEquals("Obesidade de Classe 2",faixa);
    }

    @Test
    public void testgetFaixaObesidade3(){
        Pessoa pessoa = new Pessoa(1.70,120.0);
       

        double imc = pessoa.calcularImc();

        String faixa = pessoa.getFaixa(imc);

        assertEquals("Obesidade de Classe 3",faixa);
    }

    @Test 
     public void testgetSituacaoPerder (){
        Pessoa pessoa = new Pessoa(1.70,120.0);
        
        double imc = pessoa.calcularImc();
       
        String faixa = pessoa.getSituacao(imc);

        assertEquals("PERDER",faixa);
     }

     @Test 
     public void testgetSituacaoGanhar (){
        Pessoa pessoa = new Pessoa(1.70,50.0);
       
        double imc = pessoa.calcularImc();

        String faixa = pessoa.getSituacao(imc);

        assertEquals("GANHAR",faixa);
     }

     @Test 
     public void testgetSituacaoNormal(){
        Pessoa pessoa = new Pessoa(1.70,58.0);
        
        double imc = pessoa.calcularImc();

        String faixa = pessoa.getSituacao(imc);

        assertEquals("NORMAL",faixa);
     }
    
}
