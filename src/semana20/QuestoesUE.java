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

    public List<String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<String> alternativas) {
        this.alternativas = alternativas;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
