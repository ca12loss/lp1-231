package semana05;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {
   
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");
         
    System.out.println("Entre com o seu peso: ");
    double peso = sc.nextDouble();
    System.out.println("Entre com as sua altura em metros: ");
    double altura = sc.nextDouble();

    double imc = peso/(altura*altura);
    double imcganho = 18.5;
    double imcperda = 24.9;


    System.out.println("O seu IMC é: "+deci.format(imc));

    if (imc<18.5){

        System.out.println("Peso Baixo");
        double pesoideal = ((altura*altura)*imcganho)-peso;
        System.out.println("Precisa ganhar : "+ deci.format(pesoideal)+" Kg");

    } else if (imc >= 18.5 && imc<24.9){

        System.out.println("Peso normal");
        System.out.println("Voce está no peso ideal.");

    } else if (imc>= 25.0 && imc<29.9){

        System.out.println("Excesso de peso");
        double pesoideal = peso-((altura*altura)*imcperda);
        System.out.println("Precisa perder: "+ deci.format(pesoideal)+" Kg");

    } else if (imc >= 30.0 && imc<34.9){

        System.out.println("Obesidade de Classe 1");
        double pesoideal = peso-((altura*altura)*imcperda);
        System.out.println("Precisa perder: "+ deci.format(pesoideal)+" Kg");

    } else if (imc>= 35.0 && imc<39.9){

        System.out.println("Obesidade Classe 2");
        double pesoideal = peso-((altura*altura)*imcperda);
        System.out.println("Precisa perder: "+ deci.format(pesoideal)+" Kg");

    } else {

        System.out.println("Obesidade de Classe 3");
        double pesoideal = peso-((altura*altura)*imcperda);
        System.out.println("Precisa perder: "+ deci.format(pesoideal)+" Kg");

        sc.close();
    } 

    }
}

