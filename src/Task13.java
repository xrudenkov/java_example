import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.print("Введите строку №1: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.print("Введите строку №2: ");
        String str2 = new Scanner(System.in).nextLine();
        if (str1.length()==str2.length())
            System.out.print("Длины строк равны");
        else {
            if (str1.length()>str2.length())
                System.out.println(str1);
            else System.out.println(str2);
        }
    }
}
