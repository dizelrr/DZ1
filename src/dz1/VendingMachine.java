package dz1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public Chocolate getChocolate(double calorie, double mass){
        for (Product product : products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getCalorie() == calorie && chocolate.getMass() == mass)
                    return chocolate;
            }
        }
        return null;
    }


}
