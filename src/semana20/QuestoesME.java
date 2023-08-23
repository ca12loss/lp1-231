package semana20;
import java.util.List;

public class QuestoesME extends Questoes{
    private List <String> alternativas;
    private List <String> respostas;

    public QuestoesME(int numero, String enunciado, List<String> alternativas, List<String> respostas) {
        super(numero,enunciado);
        this.alternativas = alternativas;
        this.respostas = respostas;
    }
}
