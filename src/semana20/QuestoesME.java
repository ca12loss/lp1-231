package semana20;
import java.util.List;

public class QuestoesME extends Questoes {
    private List<String> alternativas;
    private List<String> respostas;

    public QuestoesME(int numero, String enunciado, List<String> alternativas, List<String> respostas) {
        super(numero, enunciado);
        this.alternativas = alternativas;
        this.respostas = respostas;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<String> alternativas) {
        this.alternativas = alternativas;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }
}
