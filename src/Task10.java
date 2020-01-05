import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Введите значение в ячейку "+i+ ": ");
            int number = new Scanner(System.in).nextInt();
            array[i] = number;
        }
        System.out.print("Вывод массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]*2 + " ");
        }
    }
}
