package semana14;

public class Circulo {
    
       private double raio;

        public Circulo (double raio){
           setRaio(raio);
        }
    
        public double calcularPerimetro(){
            return 2*Math.PI*raio;
        }
    
        public double calcularArea(){
            return Math.PI*Math.pow(raio,2);
        }

        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            if (raio <= 0.0){
                throw new RuntimeException ("Valor inválido para raio");
            }
            this.raio = raio;
        }
    
}