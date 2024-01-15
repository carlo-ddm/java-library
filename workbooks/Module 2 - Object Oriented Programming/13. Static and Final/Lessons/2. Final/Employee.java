public class Employee {

    private String name;
    private int age;
    public static final int MINIMUM_AGE = 18;
    public static final int MAXIMUM_AGE = 65;
    
    public Employee(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("INVALID NAME");
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < MINIMUM_AGE || age > MAXIMUM_AGE) throw new IllegalArgumentException("INVALID AGE");
        this.age = age;
    }

}