import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int i = new Scanner(System.in).nextInt();
        if (i>=1 && i<=10)
            System.out.println("Таблица умножения для числа "+ i);
            System.out.println("1*"+i+"\t\t"+"2*"+i+"\t\t"+"3*"+i+"\t\t"+"4*"+i+"\t\t"+"5*"+i+"\t\t"+"6*"+i+"\t\t"+"7*"+i+"\t\t"+"8*"+i+"\t\t"+"9*"+i+"\t\t"+"10*"+i);
            System.out.println(i+"\t\t"+2*i+"\t\t"+3*i+"\t\t"+4*i+"\t\t"+5*i+"\t\t"+6*i+"\t\t"+7*i+"\t\t"+8*i+"\t\t"+9*i+"\t\t"+10*i);
    }
}
