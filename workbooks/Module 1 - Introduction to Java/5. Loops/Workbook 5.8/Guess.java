import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int number = (int) (Math.random() * 5) + 1;
        Scanner scan = new Scanner(System.in);
        int playerNumber = scan.nextInt();

        while (playerNumber != number) {
            System.out.print("Guess again: ");
            scan.nextLine();
            playerNumber = scan.nextInt();
        }

        System.out.println("You got it!");

        // See Learn the Part for detailed instructions.

        scan.close();
    }

}
