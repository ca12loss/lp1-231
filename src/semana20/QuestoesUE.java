package semana20;

import java.util.List;

public class QuestoesUE extends Questoes {
    private List<String> alternativas;
    private String resposta;

    public QuestoesUE (int numero, String enunciado, List<String> alternativas, String resposta){
        super(numero, enunciado);
        this.alternativas = alternativas;
        this.resposta = resposta;  
    }
}
