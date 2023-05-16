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
        if (valor<=saldo){
         return saldo-valor;
        } else{
            return saldo;
        }
        }
    

    public double Depositar(double valor){
        return saldo+valor;
    }

    
    
}
