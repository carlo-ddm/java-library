import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isNullOrBlank(String input) {
        return input == null || input.isBlank();
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
        return issueNumber <= 0;
    }

    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid title: ");
            if (scanner.hasNextLine()) {
                String title = scanner.nextLine();
                return title;
            }
        }
    }

    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            if (scanner.hasNextLine()) {
                String publisher = scanner.nextLine();
                return publisher;
            }
        }
    }

    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            // First check if the next input is not an integer
            // scanner.next();
            // continue;
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int issueNumber = scanner.nextInt();
            // TODO
            if (issueNumber <= 0) continue;
            else return issueNumber;
        }
    }

    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            // First check if the next input is not an integer
                  // scanner.next();
                  // continue;
                  if (!scanner.hasNextInt()) {
                    scanner.next();
                    continue;
                }
            int publicationYear = scanner.nextInt();
            // TODO
            if (publicationYear <= 0) continue;
            else return publicationYear;
        }
    }
}