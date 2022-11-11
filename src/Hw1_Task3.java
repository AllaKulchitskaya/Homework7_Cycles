public class Hw1_Task3 {
    public static void main(String[] args) {
        int populationY = 12_000_000;
        int birthrateY = 17;
        int mortalityY = 8;
        int increaseY = birthrateY-mortalityY;
        for (int year = 1; year <=10; year++) {
            populationY = populationY + populationY / 1000 * increaseY;
            System.out.println("Год " + year + ", численность населения составляет " + populationY + " человек");
        }
    }
}
