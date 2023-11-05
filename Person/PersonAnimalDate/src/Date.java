public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month) {
        this(year, month, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate() {
        System.out.println("Dátum: " + year + "-" + month + "-" + day);
    }

    public static void main(String[] args) {
        Date validDate = new Date(2023, 11, 3);
        validDate.printDate();

        Date invalidDate = new Date(2023, 2, 30);
        invalidDate.printDate();

        Date partialDate = new Date(2023, 11);
        partialDate.printDate();
    }
}
