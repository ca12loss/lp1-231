package semana14.Exercicios;

public class Pessoa {
    private double altura;
    private double peso;
    
        public Pessoa(double altura, double peso){
            this.setAltura(altura);
            this.setPeso(peso);
        }

        public double calcularImc(){
            return peso/(altura*altura);
        } 
    
        public String getFaixa(double imc){
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
    
        public String getSituacao (double imc){
            if (imc<18.5){
              return "GANHAR";
            } else if (imc>=18.5&&imc<24.9){
                return "NORMAL";
            } else{
                return "PERDER";
            }
        }

        public double getAltura() {
            return altura;
        }

        public double setAltura(double altura){
            if (altura <= 0.0){
                throw new RuntimeExcepetion ("Valor inválido para altura");
            }
            this.altura = altura;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso){
            if (peso <= 0.0){
                throw new RuntimeExcepetion ("Valor inválido para peso");
            }
            this.peso = peso;
            
        }
    }