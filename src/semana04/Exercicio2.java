package semana04;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Entre com o primeiro número:");
    double n1= sc.nextDouble();
        System.out.println("Entre com o segundo número:");
    double n2= sc.nextDouble();
        System.out.println("Entre com o terceiro número:");
    double n3= sc.nextDouble();
    
    double nmedia = (n1+n2+n3)/3;
    
    System.out.println("A média é: "+nmedia);
    
    sc.close();
}
}