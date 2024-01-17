import product.Shirt;
import static product.Shirt.Size.*;

import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(49.99, "Blue", "NIKE", LARGE);

        Pants pants = new Pants(120.99, "Black", "LEVI'S", 48, 80);

        productStore(pants);
        productStore(shirt);
    }

    public static void productStore(Product product) {
        System.out.println("\nThank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName()+ ". Your total comes to "
                + product.getPrice());
                product.fold();

                // Le due diverse configurazioni del metodo astratto wear (quella sovrascritta in Shirt e quella sovrascritta in Pants) dipendono dalla forma che prende il parametro product.
                product.wear();
    }
}
