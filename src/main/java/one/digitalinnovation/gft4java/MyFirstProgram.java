package one.digitalinnovation.gft4java;

import one.digitalinnovation.gft4java.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {
        //testes
        Order order = new Order("e1020eok", 250.42, new String[]{"arroz", "feijão", "carne"});
        System.out.println(order);
        System.out.println(order.caculatedIf());
        System.out.println(order.caculatedSwitch());
        order.showList();
    }
}
