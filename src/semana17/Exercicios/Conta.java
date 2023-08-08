package semana17.Exercicios;

import java.time.LocalDate;

public class Conta {
    
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
    }

    public void Sacar(double valor){
        if (valor <= 0.0 || valor > saldo) {
            throw new RuntimeException("Valor inválido");
         }
        saldo -= valor;
        System.out.println("Saque realizado!");
    }
    
    public void Depositar(double valor){
        if (valor <= 0.0) {
            throw new RuntimeException("Valor inválido");
        }
        saldo += valor;
        System.out.println("Depósito realizado!");
    }

    public double calcularTarifa(){
        return tarifa;
    }
    
    public double getTarifa(){
        return tarifa;
    }

    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }
}
