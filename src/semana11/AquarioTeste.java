package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AquarioTeste {
@Test  
public void testCalcularVolume(){
    Aquario aquario = new Aquario();
    aquario.comprimento = 100.0;
    aquario.largura=50.0;
    aquario.altura=50.0;

    double volume = aquario.calcularVolume();

     assertEquals(250.0,volume);
 }

@Test
 public void testcalcularPotenciaDoTermostato(){
    Aquario aquario = new Aquario();
    double volume = 160.0;
    double temperaturaAmbiente = 24.0;
    double temperaturaDesejada = 18.0;

    double potencia = aquario.calcularPotenciaDoTermostato(volume,temperaturaAmbiente,temperaturaDesejada);

    assertEquals(48.0,potencia);
 }

 @Test
 public void testcalcularQuantidadeLitrosFiltro(){
    Aquario aquario = new Aquario();
    double volume = 250.0;

    double qlitros = aquario.calcularQuantidadeLitrosFiltro(volume);

    assertEquals(750.0,qlitros);
 }

 
}
