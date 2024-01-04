public class Airline {

    Person[] people; // array that stores Person objects...

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(this.people[index]);
    }

    /**
     * Setter name: setPerson
     *
     * @param person
     *
     *               Inside the setter:
     *
     *               1. Index the array, and set that element equal to the Person
     *               object.
     */
    public void setPerson(Person person) {
        this.people[person.getSeatNumber() - 1] = new Person(person);
    }

}
