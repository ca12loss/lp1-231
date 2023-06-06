package semana14;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo (double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }
    
    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*(base+altura);
    }

    public double getBase(){
        return base;
    }

    public double setBase(double base){
        if (base<=0.0){
            throw new RuntimeExcepetion("Valor inválido para a base");
        }
         this.base=base;
    }

    public double getAltura(){
        return altura;
    }

    public double setAltura(double altura){
        if (altura<=0.0){
            throw new RuntimeExcepetion("Valor inválido para a altura");
        }
        this.altura=altura;
    
}
}