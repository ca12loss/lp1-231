package semana17;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> conta;

    public Correntista (int conta, String nome){
        this.conta = conta;
        this.nome = nome;
    }
}
