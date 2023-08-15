package semana18;

import java.time.LocalDate;

public abstract class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, double tarifa, Correntista correntista){
        this.numero = numero;
        this.tarifa = tarifa;
        this.correntista = correntista;
        this.dataAbertura = LocalDate.now();
        this.saldo =0;
        correntista.addConta(this);
    }
    public abstract double calcularTarifa();

    public void sacar(double valor){
        if(valor<=saldo){
            this.saldo -= valor;
        }
    }

}
