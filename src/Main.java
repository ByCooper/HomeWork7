public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача №1" + "\n");

        int totalMonth = 15_000;
        int totalCash = 2_459_000;
        int firstCash = 0;
        while (firstCash <= totalCash) {
            firstCash += totalMonth;
            int month = firstCash / totalMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + firstCash + " рублей»");
        }
    }
    public static void task2 () {
        System.out.println("\n" + "Задача №2" + "\n");

        int generalTotal = 10;
        int i = 1;
        while (i <= generalTotal) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();

        for (int j = generalTotal; j > 0; j--) {
            System.out.print(j + " ");
        }
    }
    public static void task3 () {
        System.out.println("\n" + "Задача №3" + "\n");

        int Y = 12_000_000;
        int period = 10;
        int totalBorn = 17;
        int totalDeath = 8;
        int ppl = 1000;
        int bornEveryYear;

        for (int i = 1; i <= period; i++) {
            bornEveryYear = ((Y / ppl) * totalBorn) - ((Y / ppl) * totalDeath);
            Y += bornEveryYear;
            System.out.println("Год " + i + ", численность населения составляет " + Y);
        }
    }
}