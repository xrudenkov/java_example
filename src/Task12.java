import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String str = new Scanner(System.in).nextLine();
        System.out.println(str);
        String[] strArray = str.split(" ");
        String newStr = "";
        for (String s : strArray) {
            newStr = newStr.concat(s);
        }
        System.out.println(newStr);
    }
}
