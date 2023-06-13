package semana14.Exercicios;

public class Conta {
    private int codigo;
    private double saldo;
    private String correntista;

    public Conta(int codigo, double saldo, String correntista){
        setCodigo(codigo);
        this.saldo = 0.0;
        setCorrentista(correntista);
    }

    public double Sacar(double valor){
        if (valor<=0.0||valor>saldo){
           throw new RuntimeException("Valor inválido");
        }
            saldo-=valor;
            return saldo;
    }

    public double Depositar(double valor){
        if (valor<=0.0){
            throw new RuntimeException("Valor inválido");
        }
            saldo+=valor;
            return saldo;
        }
    
    public double Transferir (double valor,Conta conta){
        if (valor<=0.0&& valor>saldo){
            throw new RuntimeException("Valor inválido");
        }
            saldo-=valor;    
            return conta.saldo+=valor;
        }

        public int getCodigo(){
            return codigo;
        }

        private void setCodigo (int codigo){
            if (codigo <0.0){
                throw new RuntimeException("Valor inválido para código.");
            }
            this.codigo = codigo;
        }

        public String getCorrentista(){
            return correntista;
        }

        private void setCorrentista (String correntista){
            if (correntista.length()<5 || correntista.length()>100){
                throw new RuntimeException("Valor inválido para correntista.");
            }
            this.correntista = correntista;

        }


        }
