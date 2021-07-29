package one.digitalinnovation.avancado.javafuncional.aula2;


import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa1 = Pessoa::new;

        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa1.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Carlos";
        idade = 44;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
