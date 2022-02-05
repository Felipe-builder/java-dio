package one.digitalinnovation.gft4java.POO.Relacoes.polimorfismo;

public class AppPolimorfismo {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFIlha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
