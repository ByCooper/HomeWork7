import java.text.DecimalFormat;

import static java.lang.Math.ceil;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
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

    public static void task2() {
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

    public static void task3() {
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

    public static void task4() {
        System.out.println("\n" + "Задача №4" + "\n");

        int everyMonthPercent = 7;
        int startSum = 15_000;
        int totalMoney = 12_000_000;
        double dynamicSum = startSum;

        for (int i = 1; dynamicSum <= totalMoney; i++) {

            System.out.println(i + " месяц, накопление составляет " + new DecimalFormat("###,###.##").format(dynamicSum));
            dynamicSum = ((dynamicSum / 100) * everyMonthPercent) + dynamicSum;

        }
    }

    public static void task5() {
        System.out.println("\n" + "Задача №5" + "\n");

        int everyMonthPercent = 7;
        int startSum = 15_000;
        int totalMoney = 12_000_000;
        double dynamicSum = startSum;

        for (int i = 1; dynamicSum <= totalMoney; i++) {
            if (i % 6 == 0) {
                System.out.println(i + " месяц, накопление составляет " + new DecimalFormat("###,###.##").format(dynamicSum));
            }
            dynamicSum = ((dynamicSum / 100) * everyMonthPercent) + dynamicSum;
        }
    }
    public static void task6 () {
        System.out.println("\n" + "Задача №6" + "\n");

        int totalYear = 9 * 12;
        int startSum = 15_000;
        int percentMonth = 7;
        double totalSum = startSum;

        for (int i = 1; i <= totalYear; i++) {
            totalSum = ((totalSum / 100) * percentMonth) + totalSum;
            if (i % 6 == 0) {
                System.out.println("За " + i + " месяцев, накопления составят " + new DecimalFormat("###,###.##").format(totalSum) + " рублей");
            }
        }
    }
    public static void task7 () {
        System.out.println("\n" + "Задача №7" + "\n");

        //в марте 2023 года первая пятница является 3 днем месяца
        int firstFriday = 3;
        int totalDay = 31;

        for (int i = firstFriday; i <= totalDay; i += 7) {

            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8 () {
        System.out.println("\n" + "Задача №7" + "\n");

        int startDay = 0;
        int everyEvent = 79;
        int timeZone = 200;
        int nextEvent = 100;
        int nowDate = 2023;
        int endPointYear = nowDate - timeZone;

        for (int i = startDay; i <= nowDate + nextEvent; i += everyEvent) {
            for (int j = endPointYear; j <= nowDate + nextEvent; j++) {
                if (i == j) {
                    System.out.println(j);
                }
            }
        }
    }
}