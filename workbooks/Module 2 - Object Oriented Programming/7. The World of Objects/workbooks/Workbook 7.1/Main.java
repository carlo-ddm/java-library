import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Carlo";
        person.nationality = "Italian";
        person.dateOfBirth = "29-01-1990";
        person.passport = new String[] { "Carlo", "Italian", "29-01-1990" };
        person.seatNumber = 5;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }
}
