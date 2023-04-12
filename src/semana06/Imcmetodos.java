package semana06;

public class Imcmetodos {
   
    public static double calcularImc (double peso, double altura){
        return peso/(altura*altura);
    }

    public static String classificarImc (double imc){
        if (imc<18.5){
            return "Peso Baixo";
            
        } else if (imc >= 18.5 && imc<24.9){
            return "Peso normal";

        } else if (imc>= 25.0 && imc<29.9){
            return "Sobrepeso";
    
        } else if (imc >= 30.0 && imc<34.9){
            return "Obesidade de Classe 1";
    
        } else if (imc>= 35.0 && imc<39.9){
            return "Obesidade de Classe 2";

        } else {
            return "Obesidade de Classe 3";
        }
    }

    public static double ganharPeso (double peso,double altura){
        return ((altura*altura)*18.5)-peso;
        }

    public static double perderPeso (double peso,double altura){
        return peso -((altura * altura)*24.9);
    }

}
