public class Hw1_Task1 {
    public static void main(String[] args) {
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + total/100;
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
