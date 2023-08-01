package semana17;

public class Vendedor {
    protected String nome;
    protected double vendas;
    protected double comissao;

    public Vendedor(String nome, double vendas, double comissao){
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double obterSalario(){
        return vendas*(comissao/100);
    }

    public String getNome(){
        return nome;
    }
    
    public double getVendas(){
        return vendas;
    }

    public double getComissao(){
        return comissao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setVendas(double vendas){
        this.vendas=vendas;
    }

    public void setComissao(double comissao){
        this.comissao= comissao;
    }

    }

