package one.digitalinnovation.gft4java.Collections.lists.exercicios.crime;

public class Pergunta {
    private int numeroDaQuestao;
    private String formulario;
    private boolean verdadeiro;

    public Pergunta() {
    }

    public Pergunta(int numeroDaQuestao, String formulario) {
        this.numeroDaQuestao = numeroDaQuestao;
        this.formulario = formulario;
    }

    public int getNumeroDaQuestao() {
        return numeroDaQuestao;
    }

    public void setNumeroDaQuestao(int numeroDaQuestao) {
        this.numeroDaQuestao = numeroDaQuestao;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public boolean isVerdadeiro() {
        return verdadeiro;
    }

    public void setVerdadeiro(boolean verdadeiro) {
        this.verdadeiro = verdadeiro;
    }

    @Override
    public String toString() {
        return "Pergunta{" +
                "numeroDaQuestao=" + numeroDaQuestao +
                ", formulario='" + formulario + '\'' +
                ", verdadeiro=" + verdadeiro +
                '}';
    }
}
