package one.digitalinnovation.avancado.javafuncional.aula6;

public class StringRepeat {
    public static void main(String[] args) {
        String nome = "Luan";
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += nome;
        }
        System.out.println(result);
        System.out.println("---------");
        System.out.println(nome.repeat(10));
        System.out.println("---------");
        System.out.println(nome);
    }
}
