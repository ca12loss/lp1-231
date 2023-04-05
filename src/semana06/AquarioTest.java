package semana06;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    @Test
   
    public void calcularVolume(){
       double n1 = 80;
       double n2= 50;
       double n3 =40;

        double volume = Aquariometodos.calcularVolume(n1,n2,n3);

        assertEquals(160.0,volume);
    }
    @Test
    public void calcularPotencia(){
        double volume = 160.0;
        double temperaturaDesejada = 24.0;
        double temperaturaAmbiente = 18.0;

        double potencia = Aquariometodos.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(48.0,potencia);
    }
    @Test
    public void FiltrarMin(){
        double volume =160.0;

       double filtrarmin = volume*2;

       assertEquals(320.0,filtrarmin);
    }

    @Test
    public void FiltrarMax(){
        double volume = 160.0;

        double filtrarmax=volume*3;

        assertEquals(480.0,filtrarmax);
    }


}
