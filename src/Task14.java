import java.util.Scanner;
import static java.lang.System.*;

public class Task14 {
    public static void main(String[] args) {
        out.print("Введите число: ");
        String S = new Scanner(in).nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        out.println("S=" + S + "\n" + "X=" + X + "\n" + "Y=" + Y);
    }
}
