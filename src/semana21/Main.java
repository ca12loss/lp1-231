package semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface

//classe abstrata FiguraGeomatrica - 
//interface FiguraGeometrica

// Quadrado - lado - calcular Area e Perimetro
// Retangulo - base, altura, - calcular Area e Perimetro
// Circulo - ??
//..

public class Main {
    public static void main(String[] args) {
        System.out.println("Main...");
        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        Retangulo r1 = new Retangulo(10,5);
        Circulo c1 = new Circulo(23);

        Tela tela = new Tela();
        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        tela.addFigura(c1);

        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());

        // arrays 
        double [] notas = new double[3];
        notas[0] = 10;
        notas[1] = 3.0;
        notas[2] = 5.0;
        //notas[3] = 5.0;

        System.out.println(notas[0]);

        //Coleções 
        //List 
        //Set
        //Map chave - valor

        //String nomes = new String[10];
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Jisoo");

        String nome1 = nomes.get(1);
        System.out.println(nome1);

        System.out.println(nomes.size());
        nomes.clear();
        System.out.println(nomes.size());

        for(int i =0; i<nomes.size();i++){
            String nome = nomes.get(i);
        }
        
        for (String nome : nomes){
            System.out.println(nome);
        }

        nomes.remove(1);
        //nomes.remove("Maria");

    }
}
