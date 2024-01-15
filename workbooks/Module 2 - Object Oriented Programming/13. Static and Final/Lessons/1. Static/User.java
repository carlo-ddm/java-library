public class User {

    private String firstName;
    private String lastName;
    private static int userCount = 0;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Non si usta la chiave "this" perché è un campo che appartiene a un oggetto, non alla classe. La chive "this" fa riferimento esclusivamente all'oggetto corrrente.
        userCount++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getUserCount() {
        return userCount;
    }
}