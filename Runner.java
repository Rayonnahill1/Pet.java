import java.util.Scanner;

public class Runner {
    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First pet using default constructor
        Pet pet1 = new Pet("Duke", "Dog", 9);
        System.out.println(pet1);

        // Second pet using custom constructor
        Pet pet2 = new Pet("Bella", "Dog", 11);
        System.out.println("\n" + pet2);

        // Third pet using user input
        System.out.println("\nEnter pet name: ");
        String name = scanner.nextLine();

        System.out.println("Enter pet type: ");
        String type = scanner.nextLine();

        System.out.println("Enter pet age: ");
        int age = scanner.nextInt();

        Pet pet3 = new Pet(name, type, age);
        System.out.println("\n" + pet3);

        scanner.close();
    }
}
