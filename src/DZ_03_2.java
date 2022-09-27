import java.util.Scanner;

public class DZ_03_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите номер ДЗ(3.2) (от 1 до 6): ");

        Integer dz = null;
        if (sc.hasNextInt()) {
            dz = sc.nextInt();
        }
        switch (dz) {
            case (1):
                dz1();
                break;
            case (2):
                dz2();
                break;
            case (3):
                dz3();
                break;
            case (4):
                dz4();
                break;
            case (5):
                dz5();
                break;
            case (6):
                dz6();
                break;
            default:
                System.out.println("Отсутствует указанный номер задачи");
        }
        sc.close();
    }

    private static void dz6() {
//        Составьте программу, выводящую на экран квадраты чисел от 10 до 20
//        включительно.
        for(int i = 10; i<=20; i++){
            int y = i*i;
            System.out.print(y + " ");
        }
    }

    private static void dz5() {
//        Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        int y = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(y + " ");
            y -=5;
        }
    }

    private static void dz4() {
//        Необходимо, чтоб программа выводила на экран вот такую
//        последовательность:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//        В решении используйте цикл while.
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
    }

    private static void dz3() {
//        Напишите программу, где пользователь вводит любое целое
//        положительное число. А программа суммирует все числа от 1 до
//        введенного пользователем числа.
//        Для ввода числа воспользуйтесь классом Scanner.

        Scanner sc = new Scanner(System.in);
        System.out.print("До какого числа сложить все положительные целые числа: ");

        Integer us = null;
        if (sc.hasNextInt()) {
            us = sc.nextInt();
        }
        if (us > 0) {
            int sum = 0;
            for (int i = 0; (i <= us); i++) {
                sum += i;
            }
            System.out.println("Сумма всех положительных целых чисел равна = " + sum);
        } else System.out.println("Введено отрицательное число. Попробуйте снова.");
        sc.close();
    }

    private static void dz2() {
//        Необходимо вывести на экран числа от 5 до 1.
//        При решении используйте операцию декремента (--).
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    private static void dz1() {
        //      При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        //      При решении используйте операцию инкремента (++).
        for (int i = 1; i < 100; i++) {
            if ((i % 2 == 0)) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}