package semana14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CirculoTest {
@Test
    public void testarSetRaioComPostivo(){
        Circulo circulo = new Circulo(3.0);
       
        circulo.setRaio(5.0);

        assertEquals(5.0, circulo.getRaio());
    }
   
@Test
    public void testarSetRaioComNegativo() {

    Circulo circulo = new Circulo(3.0);

    assertThrows(RuntimeException.class, () -> {
        circulo.setRaio(-9.0);
    });
    }

@Test
    public void testarSetRaioComValorNulo() {

    Circulo circulo = new Circulo(3.0);

    assertThrows(RuntimeException.class, () -> {
        circulo.setRaio(0.0);
    });
    }

@Test
    public void testarcalcularPerimetro(){
        Circulo circulo = new Circulo(2.0);

        double perimetro = circulo.calcularPerimetro();

        assertEquals(12.566370614359172,perimetro);
    }

@Test 
    public void testarcalcularArea(){
        Circulo circulo = new Circulo(3.0);

        double area = circulo.calcularArea();

        assertEquals(28.274333882308138,area);
    }

}
