package semana17.Exercicios;

import java.time.LocalDate;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, double limite) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.limite = limite;
    }

    public double calcularTarifa(){
        return tarifa;
    }

    public void Sacar(double valor){
        if (valor<=0.0||valor>saldo){
            throw new RuntimeException("Valor inválido");
         }
             saldo-=valor;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite=limite;
    }
}