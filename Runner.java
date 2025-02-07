

public class Runner {
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