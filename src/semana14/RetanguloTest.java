package semana14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class RetanguloTest {
    @Test
    public void testarsetBaseComPositivo(){
        Retangulo retangulo = new Retangulo(5,7);
        retangulo.setBase(2);
        assertEquals(2, retangulo.getBase());
    }

    @Test
    public void testarsetAlturaComPositivo(){
        Retangulo retangulo = new Retangulo(5,7);
        retangulo.setAltura(9);
        assertEquals(9, retangulo.getAltura());
    
}

    @Test
    public void testarsetBaseComNegativo(){
        Retangulo retangulo = new Retangulo(5,7);

        assertThrows(RuntimeException.class, () -> {
            retangulo.setBase(-5.0);
        });
    }

@Test
    public void testarsetBaseComValorNulo(){
        Retangulo retangulo = new Retangulo(5,7);

        assertThrows(RuntimeException.class, () -> {
            retangulo.setBase(0.0);
        });
    }


@Test 
    public void testarsetAlturaComValorNulo(){
        Retangulo retangulo = new Retangulo(5,7);

        assertThrows(RuntimeException.class, () -> {
            retangulo.setAltura(0.0);
        });
    }
@Test 
    public void testarcalcularPerimetro(){
        Retangulo retangulo = new Retangulo(5,7);
        
        double perimetro = retangulo.calcularPerimetro();

        assertEquals(24.0,perimetro);
    }


@Test
    public void testarcalcularArea(){
        Retangulo retangulo = new Retangulo(5,7);

        double area = retangulo.calcularArea();

        assertEquals(35.0,area);
    }
}