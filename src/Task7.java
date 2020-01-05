import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int X = 7;
        final int Y = 10;
        final int Z = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number == X || number == Y || number == Z) System.out.println("Данное значение имеется в константах");
        else System.out.println("Такой константы нет");
    }
}
