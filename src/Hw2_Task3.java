public class Hw2_Task3 {
    public static void main(String[] args) {
        int totalSaving = 15000;
        int percentage = 7;
        int years = 9;
        int totalMonths = 12 * years;
        for (int month = 1; month <= totalMonths; month++) {
            totalSaving = totalSaving + totalSaving / 100 * percentage;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving + " рублей");
            }
        }
    }
}
