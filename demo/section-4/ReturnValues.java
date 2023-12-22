public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        System.out.println("Area-1: " + area1);
        double area2 = calculateArea(1.6, 2.4);
        System.out.println("Area-2: " + area2);
        double area3 = calculateArea(2.6, 4.2);
        System.out.println("Area-3: " + area3);
    }

    public static double calculateArea(double length, double height) {
        double area = length * height;
        return area;
    }
}
