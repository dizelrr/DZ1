package dz1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product  product1 = new Product("Алёнушка", 200, 350);
        System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setCalorie(150);
        System.out.println(product1.displayInfo());

        Chocolate chocolate1 = new Chocolate("Лева", 1000, 210.90, 500);
        System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("Алёнушка", 800, 150.90, 200);
        System.out.println(chocolate2.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(chocolate1);
        list.add(chocolate2);

        VendingMachine vendingMachine = new VendingMachine(list);
        Chocolate chocolateRes =  vendingMachine.getChocolate(800, 200);
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }



    }

}
