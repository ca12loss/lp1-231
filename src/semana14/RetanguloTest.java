package semana14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RetanguloTest {
    @Test
    public void testarsetBase(){
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(2);
        assertEquals(2, retangulo.getBase());
    }

    @Test
    public void testarsetAltura(){
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(9);
        assertEquals(9, retangulo.getAltura());
    
}
}