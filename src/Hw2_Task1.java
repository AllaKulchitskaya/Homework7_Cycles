public class Hw2_Task1 {
    public static void main(String[] args) {
        int totalSaving = 15000;
        int percentage = 7;
        int month = 0;
        while (totalSaving <= 12000000) {
            month++;
            totalSaving = totalSaving + totalSaving / 100 * percentage;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving + " рублей");
        }
    }
}
