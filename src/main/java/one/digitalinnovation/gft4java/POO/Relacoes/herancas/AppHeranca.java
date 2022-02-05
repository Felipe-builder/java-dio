package one.digitalinnovation.gft4java.POO.Relacoes.herancas;

public class AppHeranca {
    public static void main(String[] args) {

        // instancia padr
        Funcionario funcionario = new Funcionario();

        // upcasting
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // downcasing
        Gerente gerente1 = (Gerente) new Funcionario();
        Vendedor vendedor1 = (Vendedor) new Funcionario();

    }
}
