import java.util.Scanner;
import java.util.Random;

public class secondlab2 {
    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите количество строк: ");
        int x = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int y = in.nextInt();
        int[][] mass = new int[x][y];

        //Ввод массива
        System.out.print("Ввести вручную? (y, n) ");
        String choose = in.next();
        if (choose.compareToIgnoreCase("y") == 0) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print("Введите число: ");
                    mass[i][j] = in.nextInt();
                }
            }
        } else {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    mass[i][j] = random.nextInt(100);
                }
            }
        }

        //Вывод изначального массива
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                String str = String.format("%3d", mass[i][j]);
                if (j == y-1) {
                    System.out.println(str);
                }
                else {
                    System.out.print(str);
                }
            }
        }

        //Перевод периметра массива в одномерный массив
        int[] temp = new int[999];
        int m = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || j == 0 || i == x-1 || j == y-1) {
                    temp[m] = mass[i][j];
                    m++;
                }
            }
        }

        // Сортировка пузырьком одномерного массива
        boolean need = true;
        while (need) {
            need = false;
            for (int i = 1; i < m; i++) {
                if (temp[i] < temp[i - 1]) {
                    swap(temp, i, i-1);
                    need = true;
                }
            }
        }

        // System.out.print("\n");
        // for (int i = 1; i < m; i++) {
        //     System.out.printf("%3d",temp[i]);
        // }
        // System.out.print("\n");

        //Запись отсортированного массива в двумерный массив в нужные места
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0) {
                    mass[i][j] = temp[j];
                }
                if (j == y-1 && i != 0) {
                    mass[i][j] = temp[i+y-1];
                }
                if (i == x-1 && j != y-1) {
                    mass[i][j] = temp[(y-j)+x+y-3];
                }
                if (j == 0 && i != 0 && i != x-1) {
                    mass[i][j] = temp[m-1];
                    m--;
                }
            }
        }

        //Вывод итогового массива
        System.out.print("\n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                String str = String.format("%3d", mass[i][j]);
                if (j == y-1) {
                    System.out.println(str);
                }
                else {
                    System.out.print(str);
                }
            }
        }

        

    }
}
