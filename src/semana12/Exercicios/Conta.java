package semana12.Exercicios;

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;

    public Conta(int codigo, double saldo, String correntista){
        this.codigo = codigo;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public double Sacar(double valor){
        if (valor>0.0&&valor<saldo){
            saldo-=valor;
            return saldo;
        } else{
            return 0;
        }
    }

    public double Depositar(double valor){
        if (valor>0.0){
            saldo+=valor;
            return saldo;
        } else {
            return 0.0;
        }
        }
    
    public double Transferir (double valor,Conta conta){
        if (valor<=0.0&&valor>saldo)
            throw new IllegalArgumentException("Valor inválido");
            saldo-=valor;    
            return conta.saldo+=valor;
        }
    }

    
    

