import java.util.Scanner;

public class DZ_03_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите номер ДЗ (Bonus): ");
        Integer dz3b = null;
        if (sc.hasNextInt()) {
            dz3b = sc.nextInt();
        }
        switch (dz3b) {
            case (1):
                dz1();
                break;
            case (2):
                dz2();
                break;
        }
        sc.close();
    }

    private static void dz2() {
//        Напишите программу, которая выводит на консоль таблицу умножения
        System.out.println("Таблица умножения");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t\t");
            }
            System.out.println();
        }
    }

    private static void dz1() {
//        Выведите на экран первые 11 членов последовательности Фибоначчи.
//        0 1 1 2 3 5 8 13 21 34 ...
        System.out.println("Первые 11 членов последовательности Фибоначчи");

        for (int feb1, feb2 = 0, feb3 = 1, i = 0; i < 11; i++) {
            feb1 = feb2;
            feb2 = feb3;
            feb3 = feb1 + feb2;
            System.out.print(feb1 + " ");
        }
    }
}
