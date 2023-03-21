
package semana04;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
		System.out.println("Entre com o valor da compra:");
		double valorCompra = sc.nextDouble();
		double valorFinal =0;
		
		if (valorCompra>=0.01&&valorCompra<=9.99){
		    
		    valorFinal=valorCompra-(valorCompra*0);
		    System.out.println("Percentual de desconto foi de 0%");
		    System.out.println("Valor final a pagar: R$ "+valorFinal);
		    
		} else if (valorCompra>=10&&valorCompra<=99.99){
		   
		    valorFinal=valorCompra-(valorCompra*0.05);
		    System.out.println("Percentual de desconto foi de 5%");
		    System.out.println("Valor final a pagar: R$ "+valorFinal);
		    
		} else if (valorCompra>=100&&valorCompra<=499.99){
		    
		    valorFinal=valorCompra-(valorCompra*0.1);
		    System.out.println("Percentual de desconto foi de 10%");
		    System.out.println("Valor final a pagar: R$ "+valorFinal);
		    
		} else {
		    
		    valorFinal = valorCompra-(valorCompra*0.15);
		    System.out.println("Percentual de desconto foi de 15%");
		    System.out.println("Valor final a pagar: R$ "+valorFinal);
		}
		      
		sc.close(); 
		    
	}
}

