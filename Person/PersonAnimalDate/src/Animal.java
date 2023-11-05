public class Animal {
    private int numberOfLegs;
    private int numberOfEyes;
    private String name;

    public Animal(int numberOfLegs, int numberOfEyes, String name) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.name = name;
    }

    public void printAnimal() {
        System.out.println("Név: " + name);
        System.out.println("Lábak száma: " + numberOfLegs);
        System.out.println("Szemek száma: " + numberOfEyes);
    }

    public static void main(String[] args) {
        // Példa példány létrehozása és adatainak kiírása
        Animal animal1 = new Animal(4, 2, "Kutya");
        animal1.printAnimal();

        // Példány adatainak módosítása
        animal1.numberOfLegs = 3;
        animal1.numberOfEyes = 1;
        animal1.name = "Macska";

        // Módosított adatok kiírása
        animal1.printAnimal();
    }
}
