public class Pet {
    // private data field
    private String name;

    // public constructor
    public Pet() {
        setName("Pet Name");
    }

    // mutator  method
    public void setName(String name) {
        this.name = name;
    }

    // accessor method
    public String getName() {
        return name;
    }

    // toString method
    public String toString() {
        return "Pet information:\nName: " + name;
    }

    // main
    public static void main(String[] args) {
        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // setting name of pet
        Pet pet2 = new Pet();
        pet2.setName("Bella");
        System.out.println("\n" + pet2);
    }
}
