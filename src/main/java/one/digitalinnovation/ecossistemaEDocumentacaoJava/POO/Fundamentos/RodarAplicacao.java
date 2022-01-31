package one.digitalinnovation.ecossistemaEDocumentacaoJava.POO.Fundamentos;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidateTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidateTanque());
        System.out.println(carro1.totalValorTanque(5.6));

        Carro carro2 = new Carro("Cinza", "Mercedez-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidateTanque());
        System.out.println(carro2.totalValorTanque(5.6));

    }
}
