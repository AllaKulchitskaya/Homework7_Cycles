public class Hw2_Task2 {
    public static void main(String[] args) {
        int totalSaving = 15000;
        int percentage = 7;
        int month = 0;
        while (totalSaving <= 12000000) {
            month++;
            totalSaving = totalSaving + totalSaving / 100 * percentage;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving + " рублей");
            }
        }
    }
}
