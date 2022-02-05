package one.digitalinnovation.gft4java.base;

/**
 * @author felipe
 * @version 1.0.0
 * @see java.math.BigDecimal
 * @since 1.0.0
 */

public class Order {

    // codigo
    private final String code;
    private final double totalValue;

    private String[] list;

    /**
     * construtor da class
     * @param code  coidigo do pedido
     * @param totalValue valor todal do pedido
     * @param list lista do pedido
     */
    public Order(String code, double totalValue, String[] list) {
        this.code = code;
        this.totalValue = totalValue;
        this.list = list;
    }

    /**
     *  Elee calcula o valor total de acordo como pedido
     * @return retorna o valor do pedido
     * @throws RuntimeException
     */
    public double caculatedIf() throws RuntimeException {
        if (this.totalValue < 0) {
            throw new RuntimeException("O valor não pode ser negativo");
        }
        if (totalValue > 100) {
            return totalValue * 0.99;
        } else {
            return totalValue;
        }
    }

    public double caculatedSwitch(){
        switch ((int)totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99 ;
            default:
                return totalValue;
        }
    }

    public void showList(){
        System.out.println("LISTA");
        int i = 0;
        while (i < list.length) {
            System.out.println(list[i]);
            i++;
        }
        System.out.println("\nLISTA");
        i = 0;
        do {
            System.out.println(list[i]);
            i++;
        } while (i < list.length);

        System.out.println("\nLISTA");
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[j]);
        }

        System.out.println("\nLISTA");
        for(String item : list) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                '}';
    }
}
