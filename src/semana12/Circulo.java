package semana12;

public class Circulo {
    
        public double raio;

        public Circulo (double raio){
            this.raio = raio;
        }
    
        public double calcularPerimetro(){
            return 2*Math.PI*raio;
        }
    
        public double calcularArea(){
            return Math.PI*Math.pow(raio,2);
        }
    
}
