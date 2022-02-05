package one.digitalinnovation.gft4java.POO.Relacoes.visibilidades.outropacote;

public class Classe2 extends Classe1 {

    //Atributos próprios

    void metodo(){
        //atributo2 e 3
        atributo2 = "ola";
        atributo3 = "ola de novo";

        //atributo1 não tem acesso
    }

    //metodo2 e 3
    @Override
    protected void metodo2() {
        super.metodo2();
    }

    @Override
    public void metodo3() {
        super.metodo3();
    }

    //metodo1 nao tem acesso
}
