package semana05;

import java.util.Scanner;
public class Exercicio1 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
    
        System.out.println("Entre com o comprimento do aquário:");
        double comprimento = sc.nextDouble();
        System.out.println("Entre com a altura do aquário:");
        double altura = sc.nextDouble();
        System.out.println("Entre com a largura do aquário:");
        double largura = sc.nextDouble();
        
        double volume = (comprimento*altura*largura)/100;
    
        System.out.println("Volume do aquário é: "+volume+ "L");
    
        System.out.println("Entre com a temperatura desejada:");
        double temperaturaDesejada = sc.nextDouble();
        System.out.println("Entre com a temperatura ambiente:");
        double temperaturaAmbiente = sc.nextDouble();
    
        double potencia = volume*0.05*(temperaturaDesejada - temperaturaAmbiente);
    
        System.out.println("A potencia do termostato é: "+ potencia +"watts");
    
        double filtragemMinima = volume*2;
        double filtragemMaxima = volume*3;
    
        System.out.println("A quantidade minima necessária para filtragem é: "+filtragemMinima+" L");
        System.out.println("A quantidade maxima para filtragem é"+filtragemMaxima+" L");
        sc.close();
        }
    
}
