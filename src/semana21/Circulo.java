package semana21;

public class Circulo implements FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio=raio;
    }

    @Override
    public double calcularArea() {
        return raio*raio*3.14;
    }

    @Override
    public double calcularPerimetro() {
       return 2*3.14*3.14;
    }
}
