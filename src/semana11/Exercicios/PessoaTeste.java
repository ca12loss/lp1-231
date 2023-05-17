package semana11.Exercicios;

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
    public void testgetFaixaPesoNormal (){
        Pessoa pessoa = new Pessoa();
        
        double imc = 21.8;

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Peso normal",classificacao);
    }

    @Test
    public void testgetFaixaPesoBaixo(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura= 1.70;
        pessoa.peso = 50.0;

        double imc = pessoa.calcularImc();

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Peso Baixo",classificacao);
    }

    @Test
    public void testgetFaixaSobrepeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura= 1.50;
        pessoa.peso = 60.0;

        double imc = pessoa.calcularImc();

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Sobrepeso",classificacao);
    }

    @Test
    public void testgetFaixaObesidade1(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.50;
        pessoa.peso= 75.0;

        double imc = pessoa.calcularImc();

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Obesidade de Classe 1",classificacao);
    }

    @Test
    public void testgetFaixaObesidade2(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.60;
        pessoa.peso = 90.0;

        double imc = pessoa.calcularImc();

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Obesidade de Classe 2",classificacao);
    }

    @Test
    public void testgetFaixaObesidade3(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.70;
        pessoa.peso = 120.0;

        double imc = pessoa.calcularImc();

        String classificacao = pessoa.getFaixa(imc);

        assertEquals("Obesidade de Classe 3",classificacao);
    }

@Test 
     public void testgetSituacaoPerder (){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.70;
        pessoa.peso = 120.0;

        double imc = pessoa.calcularImc();
       
        String situacao = pessoa.getSituacao(imc);

        assertEquals("PERDER",situacao);
     }

@Test 
     public void testgetSituacaoGanhar (){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.70;
        pessoa.peso= 50.0;

        double imc = pessoa.calcularImc();

        String situacao = pessoa.getSituacao(imc);

        assertEquals("GANHAR",situacao);
     }

@Test 
     public void testgetSituacaoNormal(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.70;
        pessoa.peso = 58.0;

        double imc = pessoa.calcularImc();

        String situacao = pessoa.getSituacao(imc);

        assertEquals("NORMAL",situacao);
     }
    
}
