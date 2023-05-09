package semana11;

public class Aquario {
   
    public double comprimento;
    public double altura;
    public double largura;
    
    public double calcularVolume(){
        return (comprimento*altura*largura)/1000;
    } 

    public double calcularPotenciaDoTermostato(double volume, double temperaturaDesejada,double temperaturaAmbiente){
        double potencia = volume*0.05*(temperaturaDesejada - temperaturaAmbiente );
        return potencia;
    }

    public double calcularQuantidadeLitrosFiltro (double volume){
        return volume*3;
}
}
