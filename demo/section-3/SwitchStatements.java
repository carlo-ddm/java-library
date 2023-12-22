public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("Wear sunglasses!");
                break;
            case "cloudy":
                System.out.println("Light jacket might be needed.");
                break;
            case "rainy":
                System.out.println("Bring an umbrella!");
                break;
            case "snowy":
                System.out.println("Wear a heavy coat.");
                break;
            default:
                System.out.println("Unknown weather condition!");
        }

        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1:
                System.out.println("User role: Admin");
                break;
            case 2:
                System.out.println("User role: Editor");
                break;
            case 3:
                System.out.println("User role: User");
                break;
            default:
                System.out.println("Unknown role");
        }

        // Section 3: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println("Go!");
                break;
            case "yellow":
                System.out.println("Slow down!");
                break;
            case "red":
                System.out.println("Stop!");
                break;
            default:
                System.out.println("Invalid light color");
        }

        // Section 2: Exam grade
        int grade = 85;
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
            case "Firefox":
            case "Safari":
            case "Edge":
            case "Opera":
                System.out.println("Supported browser: " + browser);
                break;
            default:
                System.out.println("Unsupported browser: " + browser);
        }
    }
}
