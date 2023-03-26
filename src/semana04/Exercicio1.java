package semana04;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
		System.out.println("Entre com o numero:");
		int numeroDigitado = sc.nextInt();
		
		System.out.println("Número antecessor é: "+ (numeroDigitado-1));
		System.out.println("Número sucessor é: "+(numeroDigitado+1));
		
		sc.close();
	}
	
}