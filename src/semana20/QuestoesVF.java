package semana20;

public class QuestoesVF extends Questoes {
    private boolean resposta;
    
    public QuestoesVF(int numero, String enunciado, boolean resposta){
        super(numero, enunciado);
        this.resposta = resposta;
    }
}
