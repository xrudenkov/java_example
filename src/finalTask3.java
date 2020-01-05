import java.util.Scanner;

public class finalTask3 {
    public static void main(String[] args) {
        System.out.print("Введите курс доллара: ");
        Scanner scan = new Scanner(System.in);
        float rate = scan.nextFloat();
        System.out.print("Введите сумму в рублях: ");
        float total = scan.nextFloat();
        float dollar = total/rate;
        System.out.printf("Количество долларов по текущему курсу: %.2f", dollar);
    }
}
