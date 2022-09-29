import java.util.Scanner;

public class lesson_4 {
    public static void main(String[] args) {
//        За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//                Напишите программу, в которую пользователь вводит сумму вклада и
//        количество месяцев. А банк вычисляет конечную сумму вклада с учетом
//        начисления процентов за каждый месяц.
//                Для вычисления суммы с учетом процентов используйте цикл for. Пусть
//        сумма вклада будет представлять тип float.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");

        if (scan.hasNextFloat()) {
            float sum = scan.nextFloat();
            System.out.print("Введите кол-во месяцев: ");
            float mes = scan.nextFloat();
            float sum1 = sum, sum2 = sum;
            for (int i = 1; i <= mes; i++) {
                sum = (float) (sum + (0.07 * sum));
                sum1 = (float) (sum1 * (1.07 / 12 * mes));
            }
            System.out.println("конечная сумма вклада с учетом начисления 7% процентов за каждый месяц = " + sum + "\n" + sum1);
        }
    }
}
