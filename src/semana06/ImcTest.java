package semana06;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ImcTest {
    @Test
    public void calcularImc (){
        double peso = 58.5;
        double altura = 1.50;

        double imc= Imcmetodos.calcularImc(peso, altura);

        assertEquals(26.0,imc);
    }
    
    @Test 
    public void classificarImcBaixo (){
        double imc = 17.45;

        String classificao = Imcmetodos.classificarImc(imc);
        assertEquals("Peso Baixo",classificao);

    }
    
    @Test 
    public void classificarImcNormal (){
        double imc = 22.45;

        String classificao = Imcmetodos.classificarImc(imc);
        assertEquals("Peso normal",classificao);

    }

    @Test 
    public void classificarImcSobrepeso (){
        double imc = 27.8;

        String classificao = Imcmetodos.classificarImc(imc);
        assertEquals("Sobrepeso",classificao);

    }

    @Test 
    public void classificarImcObesidade1 (){
        double imc = 32.8;

        String classificao = Imcmetodos.classificarImc(imc);
        assertEquals("Obesidade de Classe 1",classificao);

    }

    @Test 
    public void classificarImcObesidade2 (){
        double imc = 36.8;

        String classificao = Imcmetodos.classificarImc(imc);
        assertEquals("Obesidade de Classe 2",classificao);

    }
    
    @Test 
    public void classificarImcObesidade3 (){
        double imc = 41.2;

        String classificao = Imcmetodos.classificarImc(imc);
        assertEquals("Obesidade de Classe 3",classificao);

    }


    @Test 
    public void ganharPeso (){
        double peso = 47.0;
        double altura = 1.75;

        double maispeso = Imcmetodos.ganharPeso(peso, altura);

        assertEquals(9.65625,maispeso);
    }

    @Test 
    public void perderPeso (){
        double peso = 70.0;
        double altura = 1.52;

        double menospeso = Imcmetodos.perderPeso(peso, altura);

        assertEquals(12.47104,menospeso);

    }
}
