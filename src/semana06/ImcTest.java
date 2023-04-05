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
