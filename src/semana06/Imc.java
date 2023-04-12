package semana06;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Imc {
    public static void main(String[] args) {

             Scanner sc= new Scanner(System.in);
             DecimalFormat deci = new DecimalFormat("0.000");
                 
            System.out.println("Entre com o seu peso: ");
            double peso = sc.nextDouble();
            System.out.println("Entre com as sua altura em metros: ");
            double altura = sc.nextDouble();
        
            double imc = Imcmetodos.calcularImc(peso,altura);
            
            double imcganho = 18.5;
            double imcperda = 24.9;
        
            System.out.println("O seu IMC é: "+deci.format(imc));

            String classificar = Imcmetodos.classificarImc(imc);
            System.out.println(classificar);
       
            if (imc<imcganho){
                double ganharpeso = Imcmetodos.ganharPeso(peso, altura);
                System.out.println("Precisa ganhar: "+ deci.format(ganharpeso)+" Kg");
            } else if (imc>imcperda){
                double perderpeso = Imcmetodos.perderPeso(peso, altura);
                System.out.println("Precisa perder: "+deci.format(perderpeso)+" Kg");
            } else {
                System.out.println("Não precisa nem perder e nem ganhar, está no peso ideal");
            }
             sc.close();
        }
        }

