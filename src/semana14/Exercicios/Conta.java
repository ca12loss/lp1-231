package semana14.Exercicios;

public class Conta {
    private int codigo;
    private double saldo;
    private String correntista;

    public Conta(int codigo, double saldo, String correntista){
        this.codigo = codigo;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public double Sacar(double valor){
        if (valor<=0.0||valor>saldo)
           throw new IllegalArgumentException("Valor inválido");
            saldo-=valor;
            return saldo;
    }

    public double Depositar(double valor){
        if (valor<=0.0)
            throw new IllegalArgumentException("Valor inválido");
            saldo+=valor;
            return saldo;
        }
    
    public double Transferir (double valor,Conta conta){
        if (valor<=0.0&& valor>saldo)
            throw new IllegalArgumentException("Valor inválido");
            saldo-=valor;    
            return conta.saldo+=valor;
        }

        public double getCodigo(){
            return codigo;
        }
    }
