package dz1;

public class Chocolate extends Product{

    private double mass;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public Chocolate(String brand, double calorie, double price, double mass){
        super(brand, calorie, price);
        this.mass = mass;
    }

    @Override
    public String displayInfo() {
        return String.format("Шоколадка\n\t[Производитель: %s\n\tКалорийность: %s\n\tСтоимость: %.2f\n\tМасса: %.2f]",
                brand, calorie, price, mass);
    }
}
