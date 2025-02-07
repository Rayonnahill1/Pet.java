public class Pet {
    // Private data fields
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    // Custom constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    // speak method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    // toString method
    public String toString() {
        return "Pet information:\n" +
                "Type: " + type + "\n" +
                "Name: " + name + "\n" +
                "Sound: " + speak() + "\n" +
                "Age: " + age;
    }

    // main method
    public static void main(String[] args) {
        // First pet using default constructor
        Pet pet1 = new Pet("Duke", "Dog", 9);
        System.out.println(pet1);

        // Second pet using custom constructor
        Pet pet2 = new Pet("Bella", "Dog", 11);
        System.out.println("\n" + pet2);

        // Third pet using user input
        Pet pet3 = new Pet("Sara", "Cat", 13);
        System.out.println("\n" + pet3);
    }
}
