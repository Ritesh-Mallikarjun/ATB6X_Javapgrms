package batch11April;

public class Lab007 {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Alice", 30);

        // Retrieving person's details
        System.out.println("Name: " + person.getName()); // Output: Name: Alice
        System.out.println("Age: " + person.getAge());   // Output: Age: 30

        // Attempting to modify the person's name (which is not allowed)
        //person.setName("Bob"); // Compilation error: setName(String) has protected access

        // The person object remains unchanged
        System.out.println("After attempted modification:");
        System.out.println("Name: " + person.getName()); // Output: Name: Alice
        System.out.println("Age: " + person.getAge());   // Output: Age: 30
    }
}

 final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;  // Assigning a new String object
        this.age = age;    // Assigning a primitive value
    }

    // Getter methods (no setters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
