package semana04;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código de funcionário:");
        String codigo = sc.nextLine();

        if (codigo.length()!=7){
        System.out.println("Código inválido.");
        } else if (!codigo.startsWith("BR")||!codigo.endsWith("X") ){
            System.out.println("Código invalido.");
        } else if (codigo.charAt(2) == '0' && codigo.charAt(3) == '0' && codigo.charAt(4) == '0' && codigo.charAt(5) =='0'){
            System.out.println("Código Inválido");
        } else {
            System.out.println("Código válido.");
        }
     sc.close();

    }
}
