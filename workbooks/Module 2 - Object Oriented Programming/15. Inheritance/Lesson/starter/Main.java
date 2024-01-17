import product.Shirt;
import static product.Shirt.Size.*;

import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {
        // Product shirt = new Shirt();
        Shirt shirt = new Shirt();
        shirt.setSize(LARGE);
        shirt.setBrand("NIKE");
        shirt.setPrice(49.99);
        shirt.setColor("Blue");
        shirt.fold();

        // Product pants = new Pants();
        Pants pants = new Pants();
        pants.setWaist(48);
        pants.setLength(71);
        pants.setBrand("LEVI'S");
        pants.setPrice(120.99);
        pants.setColor("Black");
        pants.fold();

        // pantStore(pants);
        // shirtStore(shirt);

        productStore(pants);
        productStore(shirt);
    }


    // public static void pantStore(Pants pants) {
    //     System.out.println("Thank you for purchasing " + pants.getBrand() + " Pants. " + "Your total comes to "
    //             + pants.getPrice());
    // }

    // public static void shirtStore(Shirt shirt) {
    //     System.out.println("Thank you for purchasing " + shirt.getBrand() + " Shirt. " + "Your total comes to "
    //             + shirt.getPrice());
    // }

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName()+ ". Your total comes to "
                + product.getPrice());
    }
}
