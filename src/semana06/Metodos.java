package semana06;

public class Metodos {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        imprimirPalavra("Olá Mundo!");
        imprimirPalavra("wake up");
        imprimirPalavra("testeteste");
        
        double soma = Calculadora.somar(10.0,2.3);
        System.out.println(soma);


    }

    //método que soma dois números e soma o resultado
    


    //Assinatura do método
    //public - acesso em qualquer parte do objeto
    //static - método atrelado a classe (não precisa criar um objeto)
    //imprimirPalavra - nome do método
    //String palavra - parametro (pode ter zero ou muitos)
    //Definindo o método

    public static void imprimirPalavra(String palavra){
        System.out.println(palavra.toUpperCase());
    }


}
