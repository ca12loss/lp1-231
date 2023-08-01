package semana17;

import java.time.LocalDate;

public class Conta {
    
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero,LocalDate dataAbertura, double saldo, double tarifa, String correntista){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
    }

    public void obterSaque(double valor){
        if (valor<=0.0||valor>saldo){
            throw new RuntimeException("Valor inválido");
         }
             saldo-=valor;
             System.out.println("Saque realizado!");

    }
    
    public void Depositar(double valor){
        if (valor<=0.0){
            throw new RuntimeException("Valor inválido");
        }
            saldo+=valor;
            System.out.println("Depósito realizado!");
    }

    public double calcularTarifa(){
        return tarifa;
    }


    
}
