public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    // Konstruktor firstName és lastName alapján
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Konstruktor minden adattal
    public Person(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    // PrintPerson metódus adataink kinyomtatásához
    public void printPerson() {
        System.out.println("Név: " + firstName + " " + lastName);
        System.out.println("Születési dátum: " + birthYear + "-" + birthMonth + "-" + birthDay);
    }

    public static void main(String[] args) {
        // Hozzunk létre egy új példányt
        Person person = new Person("John", "Doe");

        // Állítsuk be a hiányzó adatokat
        person.birthYear = 1990;
        person.birthMonth = 5;
        person.birthDay = 15;

        // Kinyomtatjuk az adatokat
        person.printPerson();
    }
}
