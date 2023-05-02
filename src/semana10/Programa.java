package semana10;

public class Programa {
    public static void main(String[] args) {
        
        double baseRet1 = 10.0;
        double alturaRet1= 5.0;
        double areaRet1 = calcularArea(baseRet1,alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1,alturaRet1);

        System.out.println(areaRet1);
         System.out.println(perimetroRet1);

        // Objeto é uma instancia de uma classe
        Retangulo ret1 = new Retangulo();
        ret1.base= 10.0;
        ret1.altura= 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 100.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        Quadrado squr1 = new Quadrado();
        squr1.lado = 4.0;

        System.out.println("-------------------------------------");
        System.out.println("Quadrado:");
        System.out.println("Area: "+squr1.calcularArea());
        System.out.println("Perimetro: "+squr1.calcularPerimetro());
        System.out.println("--------------------------------------");

        Circulo circ1 = new Circulo();
        circ1.raio = 10.0;

        System.out.println("--------------------------------------");
        System.out.println("Círculo:");
        System.out.println("Área: "+circ1.calcularArea());
        System.out.println("Perímetro: "+circ1.calcularPerimetro());
        System.out.println("--------------------------------------");

 }
    public static double calcularArea(double base,double altura){
        return base*altura;
    }

    public static double calcularPerimetro(double base, double altura){
        return 2*(base+altura);
    }
}
