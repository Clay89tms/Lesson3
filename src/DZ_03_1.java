import java.util.Scanner;

public class DZ_03_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер ДЗ 3.1: ");

        Integer dz = null;
        if (scan.hasNextInt()) {
            dz = scan.nextInt();
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
            }

        } else {
            System.out.println("Ввели не целочисленное значение.");
        }

        scan.close();
    }

    private static void dz4() {
//        По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.).
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите Номер слоя Радуги: ");

        Integer us = null;
        if (scan.hasNextInt()) {
            us = scan.nextInt();
        }
        switch (us) {
            case (1):
                System.out.println("1-Крассный");
                break;
            case (2):
                System.out.println("2-Оранжевый");
                break;
            case (3):
                System.out.println("3-Желтый");
                break;
            case (4):
                System.out.println("4-Зеленый");
                break;
            case (5):
                System.out.println("5-Голубой");
                break;
            case (6):
                System.out.println("6-Синий");
                break;
            case (7):
                System.out.println("7-Фиолетовый");
                break;
            default:
                System.out.println("нет такого номера радуги!");
        }
        scan.close();
    }

    private static void dz3() {
//        Для введенного числа t (температура на улице) вывести
//        Если t>–5, то вывести «Тепло».
//        Если –5>= t > –20, то вывести «Нормально».
//        Если –20>= t, то вывести «Холодно».

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");

        Integer t = null;
        if (scan.hasNextInt()) {
            t = scan.nextInt();
        }
        if (t > (-5)) {
            System.out.println("Тепло");
        } else if (t <= (-5) & t > (-20)) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
        scan.close();
    }

    private static void dz2() {
        //Написать программу для вывода названия поры года по номеру месяца.
        //При решении используйте оператор if-else-if.
        System.out.println("Выводит названия поры года по номеру месяца.(if-esle-if");

        Scanner scan = new Scanner(System.in);
        System.out.print("укажите месяц: ");

        Integer us = null;
        if (scan.hasNextInt()) {
            us = scan.nextInt();
        }
        if (us == 12 || us == 1 || us == 2) {
            System.out.println("Зима");
        } else if (us == 3 || us == 4 || us == 5) {
            System.out.println("Весна");
        } else if (us == 6 || us == 7 || us == 8) {
            System.out.println("Лето");
        } else if (us == 9 || us == 10 || us == 11) {
            System.out.println("Осень'");
        } else System.out.println("Нет такого месяца");
        scan.close();
    }

    private static void dz1() {
        //Написать программу для вывода названия поры года по номеру месяца.
        //При решении используйте оператор switch-case.
        System.out.println("Выводит названия поры года по номеру месяца.(Switch-case");

        Scanner scan = new Scanner(System.in);
        System.out.print("укажите месяц: ");

        Integer us = null;
        if (scan.hasNextInt()) {
            us = scan.nextInt();
        }
        switch (us) {
            case (12):
            case (1):
            case (2):
                System.out.println("Это Зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("Это Весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("Это Лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("Это Осень'");
                break;
            default:
                System.out.println("Не верно ввели месяц!");
        }
        scan.close();
    }
}

