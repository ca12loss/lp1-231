package semana20;
import java.util.List;

public class Prova {
    private List<Questoes> questao;
    private List<Questoes> resposta;
    private double pontuacao;

    public Prova(List<Questoes> questao, List<Questoes> resposta, double pontuacao) {
        this.questao = questao;
        this.resposta = resposta;
        this.pontuacao = pontuacao;
    }
    
    public double calcularPontuacao() {
        int totalQuestoes = questao.size();
        int acertos = 0;

        for (int i = 0; i < totalQuestoes; i++) {
            Questoes questaoAtual = questao.get(i);
            Questoes respostaAtual = resposta.get(i);

            if (questaoAtual instanceof QuestoesVF && respostaAtual instanceof QuestoesVF) {
                QuestoesVF questaoVF = (QuestoesVF) questaoAtual;
                QuestoesVF respostaVF = (QuestoesVF) respostaAtual;

                if (questaoVF.ehResposta() == respostaVF.ehResposta()) {
                    acertos++;
                }
            } else if (questaoAtual instanceof QuestoesUE && respostaAtual instanceof QuestoesUE) {
                QuestoesUE questaoUE = (QuestoesUE) questaoAtual;
                QuestoesUE respostaUE = (QuestoesUE) respostaAtual;

                if (questaoUE.getResposta().equalsIgnoreCase(respostaUE.getResposta())) {
                    acertos++;
                }
            } else if (questaoAtual instanceof QuestoesME && respostaAtual instanceof QuestoesME) {
                QuestoesME questaoME = (QuestoesME) questaoAtual;
                QuestoesME respostaME = (QuestoesME) respostaAtual;

                List<String> respostasQuestao = questaoME.getRespostas();
                List<String> respostasResposta = respostaME.getRespostas();

                if (respostasQuestao.equals(respostasResposta)) {
                    acertos++;
                }
            }
        }
        return pontuacao;
    }
}
