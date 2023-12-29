import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);
    public static int randomNum;
    public static String randomCard1 = "";
    public static String randomCard2 = "";
    public static int userTotal = 0;
    public static int dealerTotal = 0;

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();
        userTotal = getRandomNumber("player");
        String check = bustChecker("player", userTotal);
        if (check != null) {
            System.out.println(check);
            System.exit(0);
        }
        dealerTotal = getRandomNumber("dealer");

        String res = "";
        while (res != "stay") {
            res = hitOrStay();
            if (!res.equalsIgnoreCase("stay")) {
                getCard("player");
            } else {
                break;
            }

        }
        System.out
                .println("\n" + "Dealer's turn" + "\n" + "The dealer's cards are" + "\n" + randomCard1 + "\n" + "and a"
                        + "\n" + randomCard2);
        String checkDealer = bustChecker("dealer", userTotal);
        if (checkDealer != null) {
            System.out.println(check);
            System.exit(0);
        }

        while (dealerTotal <= 17) {
            getCard("dealer");
            check = bustChecker("dealer", dealerTotal);
            if (check != null) {
                System.out.println(check);
                System.exit(0);
            }
        }

        System.out.println("\nUser total: " + userTotal);
        System.out.println("Dealer total: " + dealerTotal);
        if (userTotal > dealerTotal) {

            System.out.println("\nPlyer wins!");
        } else {
            System.out.println("\nDealer wins!");
        }

        scan.close();

    }

    public static void getCard(String turn) {
        int randomNum = (int) (Math.random() * 13) + 1;
        String card = cardString(randomNum);
        if (turn.equalsIgnoreCase("player")) {
            userTotal += randomNum;
            System.out.println("\n" + "You get a " + "\n" + card);
            String check = bustChecker(turn, userTotal);
            if (check != null) {
                System.out.println(check);
                System.exit(0);
            }
        } else {
            dealerTotal += randomNum;
            System.out.println("\n" + "Dealer gets a " + "\n" + card);
            String check = bustChecker(turn, userTotal);
            if (check != null) {
                System.out.println(check);
                System.exit(0);
            }
        }
    }

    public static String bustChecker(String turn, int total) {
        if (total > 21) {
            return "\nBust! " + turn + " loses";
        }
        return null;
    }

    public static int getRandomNumber(String turn) {
        int sum = 0;
        for (int i = 1; i <= 2; i++) {
            randomNum = (int) (Math.random() * 13) + 1;
            if (i == 1) {
                randomCard1 = cardString(randomNum);
                sum += randomNum;
            } else {
                randomCard2 = cardString(randomNum);
                sum += randomNum;
            }
        }

        if (turn == "player") {
            System.out.println(
                    "\n" + "You get a \n" +
                            "\n" + randomCard1 + "\n" +
                            " and a \n" +
                            "\n" + randomCard2);

            System.out.println("your total is: " + sum);
            String check = bustChecker("player", sum);
            if (check != null) {
                System.out.println("\n" + check);
                System.exit(0);
            }

        } else {
            System.out.println("\n" + "The dealer shows \n" +
                    "\n" + randomCard1 + "\n" +
                    "and has a card facing down" + "\n" + faceDown());
            System.out.println("\nThe dealer's total is hidden");

        }
        return sum;
    }

    public static int drawRandomCard() {
        return (int) (Math.random() * 13) + 1;
    }

    public static String cardString(int cardNumber) {
        switch (cardNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            default:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
        }
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    public static String hitOrStay() {
        System.out.println("\n" + "Hit or Stay?");
        String res = scan.nextLine();
        while (!res.equalsIgnoreCase("hit") || !res.equalsIgnoreCase("stay")) {
            if (res.equalsIgnoreCase("hit") || res.equalsIgnoreCase("stay")) {
                break;
            }
            System.out.println("Please write 'hit' or 'stay'");
            res = scan.nextLine();

            continue;
        }
        return res;
    }
}
