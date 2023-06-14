package semana14.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
 
public class AquarioTest {
    
@Test
    public void testsetComprimentoComValorPositivo(){
        Aquario aquario = new Aquario(10.0,5.0,7.0);

        aquario.setComprimento(6.0);

        assertEquals(6.0,aquario.getComprimento());
        
    }

@Test 
    public void testsetAlturaComValorPositivo(){
        Aquario aquario = new Aquario(10.0,5.0,7.0);

        aquario.setAltura(9.0);

        assertEquals(9.0,aquario.getAltura());
    }

@Test
    public void testsetLarguraComValorPositivo(){
        Aquario aquario = new Aquario(10.0,5.0,7.0);

        aquario.setLargura(14.0);

        assertEquals(14.0,aquario.getLargura());
    }

@Test
    public void testsetComprimentoComValorNegativo(){
        Aquario aquario = new Aquario(10.0,5.0,7.0);
        
        assertThrows(RuntimeException.class, () -> {
            aquario.setComprimento(-10.0);
        });
    }

@Test
        public void testsetAlturaComValorNegativo(){
            Aquario aquario = new Aquario(10.0,5.0,7.0);
            
            assertThrows(RuntimeException.class, () -> {
                aquario.setAltura(-5.0);
            });
    
    }

@Test
    public void testsetLarguraComValorNegativo(){
        Aquario aquario = new Aquario(10.0,5.0,7.0);
        
        assertThrows(RuntimeException.class, () -> {
            aquario.setLargura(-7.0);
        });

}

@Test
    public void testsetComprimentoComValorNulo(){
        Aquario aquario = new Aquario(10.0,5.0,7.0);
        
        assertThrows(RuntimeException.class, () -> {
            aquario.setComprimento(0.0);
        });
    }

@Test
        public void testsetAlturaComValorNulo(){
            Aquario aquario = new Aquario(10.0,5.0,7.0);
            
            assertThrows(RuntimeException.class, () -> {
                aquario.setAltura(0.0);
            });
    
    }

@Test
    public void testsetLarguraComValorNulo(){
        Aquario aquario = new Aquario(10.0,5.0,7.0);
        
        assertThrows(RuntimeException.class, () -> {
            aquario.setLargura(0.0);
        });

}

   


}
