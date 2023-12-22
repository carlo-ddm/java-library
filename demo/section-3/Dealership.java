import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("You chose option 'a' to buy a car");

                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                scan.nextLine();

                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available");

                    System.out.println("Do you have insurance? Write 'yes' or 'no'");
                    String insurance = scan.nextLine();

                    System.out.println("Do you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();

                    System.out.println("What is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                        System.out.println("Sold! Pleasure doing business with you");
                    } else {
                        System.out.println("We're sorry. You are not eligible");
                    }
                } else {
                    System.out.println("We're sorry. You are not eligible");
                }
                break;
                
            case "b":
                System.out.println("You chose option 'b' to sell a car");

                System.out.println("What is your car valued at?");
                int value = scan.nextInt();

                System.out.println("What is your selling price?");
                scan.nextLine();
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("We will buy your car. Pleasure doing business with you!");
                } else {
                    System.out.println("Sorry, we're not interested.");
                }
                break;

            default:
                System.out.println("Invalid option: " + option);
                break;
        }
        
        scan.close();
    }
}
