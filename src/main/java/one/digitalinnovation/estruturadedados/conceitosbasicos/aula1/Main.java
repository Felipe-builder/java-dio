package one.digitalinnovation.estruturadedados.conceitosbasicos.aula1;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("intA="+ a + "; intB="+ b);
        a = 2;
        System.out.println("intA="+ a + "; intB="+ b);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("objA="+objA+"; objB="+objB);
        objA.setNum(2);
        System.out.println("objA="+objA+"; objB="+objB);

    }
}
