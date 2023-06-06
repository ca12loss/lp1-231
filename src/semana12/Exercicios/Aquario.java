package semana12.Exercicios;

public class Aquario {
    
        public double comprimento;
        public double altura;
        public double largura;

        public Aquario (double comprimento, double altura, double largura) {
            this.comprimento = comprimento;
            this.altura = altura;
            this.largura = largura;
        }

        public Aquario (double valor){
            comprimento = valor;
            altura = valor;
            largura = valor;
        }
        
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
