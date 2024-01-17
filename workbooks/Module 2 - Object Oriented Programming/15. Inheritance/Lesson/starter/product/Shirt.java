package product;

public class Shirt extends Product {

    private Size size;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        setSize(size);
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        // TODO Auto-generated method stub
        super.fold();
        System.out.println("Lay a shirt on a flat surface.");
        System.out.println("Fold the shirt sideways.");
        System.out.println("Bring sleeves in.");
        System.out.println("Fold from bottom up.");
    }
}
