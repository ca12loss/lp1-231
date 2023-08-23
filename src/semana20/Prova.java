package semana20;
import java.util.List;

public class Prova {
    private List<Questoes>questao;
    private List<Questoes>resposta;
    private double pontuacao;

    public Prova(List<Questoes> questao, List<Questoes> resposta, double pontuacao) {
        this.questao = questao;
        this.resposta = resposta;
        this.pontuacao = pontuacao;
    }
    
    public double calcularPontuacao() {
        pontuacao = 0;
        for (int i = 0; i < questao.size(); i++) {
            Questoes questaoAtual = questao.get(i);
            Questoes respostaAtual = resposta.get(i);
            
            if (questaoAtual.equals(respostaAtual)) {
                pontuacao ++;
            }
        }

        return pontuacao;
    }
}