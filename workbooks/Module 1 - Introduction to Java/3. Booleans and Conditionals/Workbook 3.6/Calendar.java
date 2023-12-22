public class Calendar {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        String day = "Friday"; // Can be any day.
        System.out.println("\nHey, are you free on " + day + "? \n");
        System.out.println("Hmm, let me check my calendar.");

        // Check 'calendar' here:
        
        switch (day) {
            case "Monday":
                System.out.println("\nSorry, I have to stay at work late.");
                break;
            case "Tuesday":
                System.out.println("\nIt looks like I have meetings all day");
                break;
            case "Wednesday":
                System.out.println("\nI have a dentist appointment. Some other time!");
                break;
            case "Thursday":
                System.out.println("\nSorry, thursday is date night!");
                break;
            case "Friday":
                System.out.println("\nI'm free!!");
                break;
            case "Saturday":
                System.out.println("\nI'm free!!");
                break;
            case "FriSundayday":
                System.out.println("\nI'm free!!");
                break;
            default:
                System.out.println("\nThat's not a day.");
                break;
        }

        

    }
}
