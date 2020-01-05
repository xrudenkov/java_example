import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три числа: x=");
        int x = scanner.nextInt();
        System.out.print("\t\t\t\t   y=");
        int y = scanner.nextInt();
        System.out.print("\t\t\t\t   z=");
        int z = scanner.nextInt();
        double average = (double) (x + y + z) / 3;
        System.out.println(average);
        int a = (int) average / 2;
        System.out.println(a);
        if (a > 3) System.out.println("Программа выполнена корректно");
    }
}

