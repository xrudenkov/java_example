import java.util.Scanner;

public class finalTask1 {
    public static void main(String[] args) {
        System.out.print("Введите бинарное число: ");
        char[] binaryArray = new Scanner(System.in).nextLine().toCharArray();
        int result = 0;
        for(int i=binaryArray.length-1; i>=0; i--){
            int numberArray = Character.getNumericValue(binaryArray[i]);
            if (numberArray == 1) {
                int total = 1;
                for (int j = i; j < binaryArray.length-1; j++)
                    if (i != binaryArray.length - 1)
                        total *= 2;
                result+=total;
            }
        }
        System.out.println("Число в десятичном формате: " + result);
    }
}
