package semana04;

public class EstruturasControle {
    public static void main(String[] args) {
        // if 

        final int MAIORIDADE =18;
        var idade = 17;

        if (idade>=MAIORIDADE) {
            System.out.println("Maior de idade");
        }

        var ligado = false;
        if (ligado) {
            System.out.println("Está ligado");
        } else {
            System.out.println("Está desligado");
        }

        //switch
        // char, byte, short,
        // literal string
        //enum

        int n =2; 

        switch (n) {
            case 1:
                System.out.println("Número 1");
                break;
                case 2:
                System.out.println("Número 2");
                break;
                case 3:
                System.out.println("Número 3");
                break;
        
            default:
            System.out.println("Não identificado");
          break;
        }

        //loops
        //for, foreach, while, do while

        int contador=0;
        while (contador<3) {
            System.out.println("While Ligadoo!");
            contador++;
        }

        contador=0;
        do{
            System.out.println("Do while Ligado!!");
            contador++;
        } while (contador <3);

        for (int i = 0; i<3; i++) {
            System.out.println("For Ligado!");
            }

            // String nome = "João";
            //Array
            // armazena mais de um elemento
            // acesso via index inteiro
            // tamanho fixo no momento da criação

            //nomes = [_____, _____, _____]
            //          0       1      2
            String[] nomes = new String [3];
            nomes [0] = "Maria";
            nomes [1] = "Marta";
            nomes [2] = "Marla";

            System.out.println(nomes[0]);
            System.out.println(nomes[1]);
            System.out.println(nomes[2]);

            for (int i = 0; i < nomes.length; i++) {
                System.out.println(nomes[i]);
            }

            //foreach
            for (String nome : nomes) {
                System.out.println(nome);
            }
            
            int [] numeros ={1,3,5,0};
            for (int numero : numeros) {
                System.out.println(numero);
            }
        }
}
