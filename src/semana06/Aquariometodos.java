package semana06;

public class Aquariometodos {
    
    public static double calcularVolume(double comprimento,double altura,double largura){
        double volume = (comprimento*altura*largura)/1000;
        return volume;
    }

    public static double calcularPotencia(double volume,double temperaturaDesejada,double temperaturaAmbiente){
        double potencia = volume*0.05*(temperaturaDesejada - temperaturaAmbiente );
        return potencia;
    }

    public static double filtrarMin (double volume){
        return volume*2;
    }

    public static double filtrarMax (double volume){
        return volume*3;
    }

}
