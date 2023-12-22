public class ReturnValuesPart2 {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.2);

        // calculateArea(-5, 2.3);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
    }

    public static double calculateArea(double length, double height) {
        if (length < 0 || height < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }

        double area = length * height;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";

            case "French":
                return "La surface est egale a la longueur * la largeur";

            case "Spanish":
                return "area es igual a largo * ancho";

            default:
                return "Language not available";
        }
    }
}
