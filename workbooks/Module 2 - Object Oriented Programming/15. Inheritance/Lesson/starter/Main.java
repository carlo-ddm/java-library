import product.Shirt;
import static product.Shirt.Size.*;

import product.Pants;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setSize(LARGE);
        shirt.setBrand("NIKE");
        shirt.setPrice(49.99);
        shirt.setColor("Blue");
        shirt.fold();

        Pants pants = new Pants();
        pants.setWaist(48);
        pants.setLength(71);
        pants.setBrand("LEVI'S");
        pants.setPrice(120.99);
        pants.setColor("Black");
        pants.fold();
    }

}
