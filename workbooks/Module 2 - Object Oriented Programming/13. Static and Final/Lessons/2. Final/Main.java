public class Main {
    public static void main(String[] args) {
        
        Employee john = new Employee("John", 45);
        Employee lisa = new Employee("Lisa", 20);

        int minAge = Employee.MINIMUM_AGE;
        int maxAge = Employee.MAXIMUM_AGE;
        System.out.println("Retirement Age: " + minAge);
        System.out.println("Minimum Working Age: " + maxAge);

        System.out.println(john.getName() + ", you can retire in " + (maxAge - john.getAge()) + " years.");
        System.out.println(lisa.getName() + ", you have been eligible to work for " + (lisa.getAge() - minAge) + " years.");

    }
}
