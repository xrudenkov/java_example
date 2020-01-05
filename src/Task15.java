import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        System.out.println("Заполните массив числами: ");
        for (int i=0; i<array.length; i++){
            System.out.print("Array["+i+"] = ");
            array[i] = scan.nextInt();
        }
        for (int value : array) System.out.print(value + " ");

        for (int i=array.length; i>0; i--){
            for (int j=0; j<i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int numberMax = array[j];
                    array[j] = array[j+1];
                    array[j+1] = numberMax;
                }
            }
        }
        System.out.println();
        for (int value : array) System.out.print(value + " ");
    }
}
