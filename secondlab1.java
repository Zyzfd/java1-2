import java.util.Scanner;
import java.util.Random;

public class secondlab1 {
public static void main(String[] args) {
        int[] mass = new int[999];
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int x = 0;

        System.out.print("Ввести вручную? (y, n) ");
        String choose = in.next();
        System.out.print("Введите длину массива: ");
        int len = in.nextInt();
        if (choose.compareToIgnoreCase("y") == 0) {
                for (int i = 0; i < len; i++) {
                        System.out.print("Введите число: ");
                        mass[i] = in.nextInt();
                }
        } 
        else {
                for (int i = 0; i < len; i++) {
                        mass[i] = random.nextInt(10);
                }
        }

        System.out.print("Массив: ");
        for (int i = 0; i < len-1; i++) {
                System.out.printf("%3d,", mass[i]);
        }
        System.out.printf("%3d", mass[len-1]);
        System.out.print("\n");

        int[] result = new int[999];
        result[0] = mass[0];
        int j = 1;
        if (mass[0] == 0) {
                System.out.println("Деление на 0!");
                return;
        }
        for (int i = 1; i <= len; i++) {
                if (mass[i] % mass[0] != 0) {
                        result[j] = mass[i];
                        j++;
                }
        }

        System.out.print("Итог: ");
        for (int i = 0; i < j-1; i++) {
                System.out.printf("%3d,", result[i]);
        }
        System.out.printf("%3d", result[j-1]);
        System.out.print("\n");
}
}
