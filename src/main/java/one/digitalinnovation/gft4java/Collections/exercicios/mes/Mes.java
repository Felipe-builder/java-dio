package one.digitalinnovation.gft4java.Collections.exercicios.mes;

public class Mes {

    private int ordem;
    private String nome;
    private double temperatura;

    public Mes() {
    }

    public Mes(int ordem, String nome, double temperatura) {
        this.ordem = ordem;
        this.nome = nome;
        this.temperatura = temperatura;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return ordem +
                " - " + nome + ' ' +
                 temperatura + "ºC, ";
    }
}
