public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[] {"Tires", "Keys"};
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);
        
        
        Car nissan2 = new Car(nissan);
        nissan2.setColor("Yellow");
        
        spareParts[0] = "Window";
        
        nissan.drive();
        dodge.drive();
        nissan2.drive();
    }
}
