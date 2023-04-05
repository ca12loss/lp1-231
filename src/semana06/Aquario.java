package semana06;
import java.util.Scanner;

public class Aquario {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    
        System.out.println("Entre com o comprimento do aquário:");
        double comprimento = sc.nextDouble();
        System.out.println("Entre com a altura do aquário:");
        double altura = sc.nextDouble();
        System.out.println("Entre com a largura do aquário:");
        double largura = sc.nextDouble();

        double volume = Aquariometodos.calcularVolume(comprimento,altura,largura);
        System.out.println("Volume do aquário é: "+volume+ "L");
    
        System.out.println("Entre com a temperatura desejada:");
        double temperaturaDesejada = sc.nextDouble();
        System.out.println("Entre com a temperatura ambiente:");
        double temperaturaAmbiente = sc.nextDouble();
        
        double potencia = Aquariometodos.calcularPotencia(volume,temperaturaDesejada,temperaturaAmbiente);
    
         System.out.println("A potencia do termostato é: "+ potencia +"watts");
    
        double filtragemMinima = Aquariometodos.filtrarMin(volume);
        double filtragemMaxima = Aquariometodos.filtrarMax(volume);
    
        System.out.println("A quantidade minima necessária para filtragem é: "+filtragemMinima+" L");
        System.out.println("A quantidade maxima para filtragem é "+filtragemMaxima+" L");
        sc.close();
        }
}

