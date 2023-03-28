package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    @Test
    public void somaDoisNumerosPositivos(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= 2.0;

        //Act
        double soma= Calculadora.somar(n1,n2);

        //Assert
        assertEquals(12.0,soma);
    }
    @Test
    public void somaUmNumeroPositivoEUmNegativo(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= -2.0;

        //Act
        double soma= Calculadora.somar(n1,n2);

        //Assert
        assertEquals(8,soma);
    }
    @Test
    public void somaDoisNumerosNegativos(){
        //AAA
        //Arrange 
        double n1= -10.0;
        double n2= -2.0;

        //Act
        double soma= Calculadora.somar(n1,n2);

        //Assert
        assertEquals(-12,soma);
    }
    @Test
    public void subtraiUmNumeroPositivoEUmPositivo(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= 2.0;

        //Act
        double subtrai = Calculadora.subtrair(n1,n2);

        //Assert
        assertEquals(8.0,subtrai);
    }
    @Test
    public void subtraiUmNumeroNegativoEUmNegativo(){
        //AAA
        //Arrange 
        double n1= -10.0;
        double n2= -2.0;

        //Act
        double subtrai = Calculadora.subtrair(n1,n2);

        //Assert
        assertEquals(-8.0,subtrai);
    }
    @Test
    public void subtraiUmNumeroPositivoEUmNegativo(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= -2.0;

        //Act
        double subtrai = Calculadora.subtrair(n1,n2);

        //Assert
        assertEquals(12.0,subtrai);
    }
    @Test
    public void multiplicaUmNumeroPositivoEUmPositivo(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= 2.0;

        //Act
        double multiplica = Calculadora.multiplicar(n1,n2);

        //Assert
        assertEquals(20.0,multiplica);
    }

    @Test
    public void multiplicaUmNumeroPositivoEUmNegativo(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= -2.0;

        //Act
        double multiplica = Calculadora.multiplicar(n1,n2);

        //Assert
        assertEquals(-20.0,multiplica);
    }
    @Test
    public void multiplicaUmNumeroNegativoEUmNegativo(){
        //AAA
        //Arrange 
        double n1= -10.0;
        double n2= -2.0;

        //Act
        double multiplica = Calculadora.multiplicar(n1,n2);

        //Assert
        assertEquals(20.0,multiplica);
    }

    @Test
    public void divideUmNumeroPositivoEUmPositivo(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= 2.0;

        //Act
        double divide = Calculadora.dividir(n1,n2);

        //Assert
        assertEquals(5.0,divide);
    }

    @Test
    public void divideUmNumeroPositivoEUmNegativo(){
        //AAA
        //Arrange 
        double n1= 10.0;
        double n2= -2.0;

        //Act
        double divide = Calculadora.dividir(n1,n2);

        //Assert
        assertEquals(-5.0,divide);
    }
    @Test
    public void divideUmNumeroNegativoEUmNegativo(){
        //AAA
        //Arrange 
        double n1= -10.0;
        double n2= -2.0;

        //Act
        double divide = Calculadora.dividir(n1,n2);

        //Assert
        assertEquals(5.0,divide);
    }
}


