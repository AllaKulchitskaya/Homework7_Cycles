public class Hw3_Task1 {
    public static void main(String[] args) {
        int currentYear = 2022;
        int minYear = currentYear - 200;
        int maxYear = currentYear + 100;
        for (int cometYear = minYear; cometYear <= maxYear; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
            }
        }
    }
}
