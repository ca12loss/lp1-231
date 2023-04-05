package semana06;

public class Imcmetodos {
   
    public static double calcularImc (double peso, double altura){
        return peso/(altura*altura);
    }

    public static double ganharPeso (double peso,double altura){
        return ((altura*altura)*18.5)-peso;
        }

    public static double perderPeso (double peso,double altura){
        return peso -((altura * altura)*24.9);
    }

}
