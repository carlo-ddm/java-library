import product.Shirt;
import static product.Shirt.Size.*;

import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(49.99, "Blue", "NIKE", LARGE);
        // shirt.setBrand("NIKE");
        // shirt.setPrice(49.99);
        // shirt.setColor("Blue");
        shirt.fold();

        Pants pants = new Pants(120.99, "Black", "LEVI'S", 48, 80);
        // pants.setBrand("LEVI'S");
        // pants.setPrice(120.99);
        // pants.setColor("Black");
        pants.fold();

        productStore(pants);
        productStore(shirt);
    }

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName()+ ". Your total comes to "
                + product.getPrice());
    }
}
