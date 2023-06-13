package semana14.Exercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PessoaTest {
@Test
    public void testsetPesoComValorPositivo(){
        Pessoa pessoa = new Pessoa(1.70,56.0);
        pessoa.setPeso(54.0);

       assertEquals(54.0,pessoa.getPeso());

    }

@Test
    public void testsetAlturaComValorPositivo(){
        Pessoa pessoa = new Pessoa(1.70,56.0);
        pessoa.setAltura(1.75);

       assertEquals(1.75,pessoa.getAltura());

    }

@Test 
    public void testsetPesoComValorNegativo(){
        Pessoa pessoa = new Pessoa(1.70,56.0);
       
        assertThrows(RuntimeException.class, () -> {
            pessoa.setPeso(-48.0);
        });
    }
    
@Test 
    public void testsetAlturaComValorNegativo(){
        Pessoa pessoa = new Pessoa(1.70,56.0);
       
        assertThrows(RuntimeException.class, () -> {
            pessoa.setAltura(-1.70);
        });
    }

@Test 
    public void testsetPesoComValorNulo(){
        Pessoa pessoa = new Pessoa(1.70,56.0);
       
        assertThrows(RuntimeException.class, () -> {
            pessoa.setPeso(0.0);
        });
    }
    
@Test 
    public void testsetAlturaComValorNulo(){
        Pessoa pessoa = new Pessoa(1.70,56.0);
       
        assertThrows(RuntimeException.class, () -> {
            pessoa.setAltura(0.0);
        });
    }

// Testes dos outros métodos

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
