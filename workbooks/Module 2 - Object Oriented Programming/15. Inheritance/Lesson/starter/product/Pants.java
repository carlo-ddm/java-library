package product;

public class Pants extends Product {

    private int waist;
    private int length;

    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        setWaist(waist);
        setLength(length);
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        super.fold();
        // TODO Auto-generated method stub
        System.out.println("\nHold the pants upright.");
        System.out.println("Fold one leg over the other.");
        System.out.println("Fold pants from bottom in thirds.");
    }

    @Override
    public void wear() {
        // TODO Auto-generated method stub
        System.out.println("The " + this.waist + " " + this.length + " pants look great on you!");
    }
}
