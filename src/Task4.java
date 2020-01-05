import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите число в 2-ой системе счисления: ");
        String i = new Scanner(System.in).nextLine();
        int b = Integer.parseInt(i, 2);
        System.out.println("В 10-ой системе счисления = "+b);
    }
}
