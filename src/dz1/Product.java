package dz1;
public class Product {

    protected double calorie;

    protected String brand;

    protected double price;

    public double getCalorie() {return calorie;
    }

    public void setCalorie(double calorie) {
        processCalorie(calorie);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        processBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        processPrice(price);
    }

    private void processPrice(double price){
        if (price < 100){
            this.price = 250;
        }
        else {
            this.price = price;
        }
    }

    private void processCalorie(double calorie){
        if (calorie < 100){
            this.calorie = 250;
        }
        else {
            this.calorie = calorie;
        }
    }


    private void processBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else {
            this.brand = brand;
        }
    }

    public Product(String brand, double calorie, double price){
        processBrand(brand);
        processCalorie(calorie);
        processPrice(price);
    }

    public Product(double calorie, double price){
        this("<BRAND>", calorie, price);

    }

    public Product(double calorie){
        this(calorie, 250);

    }

    public String displayInfo(){
        return String.format("%s - %.2f - %.2f", brand, calorie, price);
    }


}
