package semana03;

import java.util.Scanner;


public class Introducao {
    public static void main (String[] args){
        // Comentário de linha
        /* 
         * Comentários de múltoplas linhas
         */

         // Tipos Primitivos

         // Inteiros
         // byte, short, int, long

         byte n1=100; // 1 byte -128 a 127 
         short n2= 3000; // 2 bytes -32768 a 32767
         int n3= 4000000;// 4 bytes - 2 bilhoes
         long n4 = 19283748384858l;// 8 bytes

         // Ponto flutuante
         // float, double

         float nota1 = 9.95f; // 4 bytes
         double nota2 = 9.5;  // 8 bytes

         // char
         char letra = 'A';

         //boolean
         boolean ligado = true;
         boolean teste = false;

         // String 
         String palavra = "Olá mundo";

         System.out.println(palavra);
         System.out.println(palavra.toLowerCase());
         System.out.println(palavra.toUpperCase());

         // Variáveis e constantes
         // TIPO nome = valor;
         //tipo nome;
         // nome = valor;
        short idade =30;

        short idade2;
        idade2 = 30;

         // Java 10 - Inferencia de tipos

         var sobrenome = "Santos";
         var idade3 = 25;

         //Constantes
         final double TESTE = 30.4;

         //Entrada e saída de dados
         // Instancia um objeto scanner para receber dados do usúario
          Scanner sc = new Scanner(System.in);

          System.out.println("Entre com o seu nome");
          String nomeInformado = sc.nextLine();

          System.out.println("Entre com a sua idade");
          short idadeInformada = sc.nextShort();

          System.out.println(nomeInformado + " " + idadeInformada);
        //Fecha o objeto Scanner liberando
        // os recursos alocados
          sc.close();
    }
}
