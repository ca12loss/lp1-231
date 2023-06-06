package semana14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CirculoTest {
    @Test
    public void testarSetRaio(){
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        assertEquals(5, circulo.getRaio());
    }
    @Test
    public void testarGetRaio(){
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        assertEquals(5, circulo.getRaio());
    
}
}