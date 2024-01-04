public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[] { "Tires", "Keys" };

        // **
        Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] { "Tires", "Keys" });
        String[] newCarParts = new String[] { "wheels", "brakes" };
        nissan.setParts(newCarParts);
        newCarParts[0] = "Filter";
        // **

        Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] { "Tires", "Keys" });
        Car nissan2 = new Car(nissan);
        spareParts[0] = "Window";

        nissan2.setColor("Yellow");

        nissan.drive();
        dodge.drive();
        nissan2.drive();
    }
}
