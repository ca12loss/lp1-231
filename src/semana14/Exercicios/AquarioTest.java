package semana14.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
 
public class AquarioTest {
    @Test
    
    public void testargetesetComprimento(){
        Aquario aquario = new Aquario(5,5,5);
        aquario.setComprimento(10);
        aquario.setAltura(10);
        aquario.setLargura(10);
        
        assertEquals(10, aquario.getComprimento());
        assertEquals(10, aquario.getAltura());
        assertEquals(10, aquario.getLargura());
    }

   


}
