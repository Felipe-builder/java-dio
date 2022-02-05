package one.digitalinnovation.gft4java.entendendo_metodos.criacao;

public class Emprestimo {
    public static double receberComJuros(double valor) {
        double juros = 0;
        if (valor <= 1000) {
            juros = 2.0;
        } else if (valor <= 1500) {
            juros = 2.5;
        } else if (valor <= 2000) {
            juros = 3;
        } else if (valor <= 5000) {
            juros = 3.5;
        } else if(valor <= 10000) {
            juros = 4;
        } else if (valor > 10000) {
            juros = 15;
        }
        return valor += valor * (juros / 100) ;
    }
}
