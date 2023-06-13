package semana14.Exercicios;

public class Aquario {
    
        private double comprimento;
        private double altura;
        private double largura;

        public Aquario (double comprimento, double altura, double largura) {
            this.setComprimento(comprimento);
            this.setAltura(altura);
            this.setLargura(largura);
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
        
        public double getComprimento(){
            return comprimento;
        }

        public void setComprimento(double comprimento){
            if (comprimento <=0.0){
                throw new RuntimeException("Valor inválido para comprimento");
            }
            this.comprimento = comprimento;
        }

        public double getAltura(){
            return altura;
        }

        public void setAltura(double altura){
            if (altura <=0.0){
                throw new RuntimeException("Valor inválido para altura");
            }
            this.altura = altura;
        }

        public double getLargura(){
            return largura;
        }

        public void setLargura(double largura){
            if (largura <=0.0){
                throw new RuntimeException("Valor inválido para largura");
            }
            this.largura = largura;
        }

        
        
}
