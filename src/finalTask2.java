import java.util.Random;

public class finalTask2 {
    public static void main(String[] args) {
//        System.out.print("Введите размерность массива: ");
//        Scanner scan = new Scanner(System.in);
//        int[] array = new int[scan.nextInt()];
//        System.out.println("Заполните массив числами: ");
//        for (int i=0; i<array.length; i++){
//            System.out.print("Array["+i+"] = ");
//            array[i] = scan.nextInt();
//        }

        int[] arrayShell = createArray();
        long start_date = System.nanoTime();
        shellSort(arrayShell);
        long nanoseconds = (System.nanoTime() - start_date);
        printArray(arrayShell, "sortShell", nanoseconds);

        int[] arraySelection = createArray();
        start_date = System.nanoTime();
        selectionSort(arraySelection);
        nanoseconds = (System.nanoTime() - start_date);
        printArray(arraySelection, "sortSelection", nanoseconds);

        int[] arrayInsertion = createArray();
        start_date = System.nanoTime();
        insertionSort(arrayInsertion);
        nanoseconds = (System.nanoTime() - start_date);
        printArray(arrayInsertion, "sortInsertion", nanoseconds);

        int[] arrayQuick = createArray();
        start_date = System.nanoTime();
        quickSort(arrayQuick, 0,arrayQuick.length - 1);
        nanoseconds = (System.nanoTime() - start_date);
        printArray(arrayQuick, "sortQuick", nanoseconds);

    }
    private static void quickSort(int[] array, int start, int end){
        if (start >= end) return;
        int i = start;
        int j = end;
        int m = (i+j)/2;
        while (j > i) {
            while (i < m && array[i] <= array[m]) i++;
            while (j > m && array[j] >= array[m]) j--;

            if (i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == m) m = j;
                else if (j == m) m = i;
            }
        }
        quickSort(array, start, m);
        quickSort(array, m+1, end);
    }
    private static void insertionSort(int[] data) {
        for (int i=1; i<data.length; i++) {
            int j = i;
            int key = data[i];
            while (j>0 && data[j-1] > key){
                data[j] = data[j-1];
                j--;
            }
            data[j] = key;
        }
    }
    private static void shellSort(int[] array) {
        int inner, outer;
        int temp;

        int h = 1;
        // ищем начальное значение h
        while (h <= array.length / 3) {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) {
            //сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                //сортируем массив с шагом h
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            //на каждом шаге уменьшаем h
            h = (h - 1) / 3;
        }
    }
    private static void selectionSort(int[] array){
        int min, temp;
        for (int i=0; i<array.length-1; i++){
            min = i;
            for (int j=i+1; j<array.length; j++){
                if (array[min]>array[j])
                    min = j;
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    private static int[] createArray(){
        int n = 20;
        int[] array = new int[n];
        Random rnd = new Random();
        System.out.println();
        System.out.print("unsorted array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(n*5);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
    private static void printArray(int[] array, String nameArray, long sortTime){
        System.out.print(nameArray + " :: time - " + sortTime + " nanoseconds :: array - ");
        for (int value : array) System.out.print(value + " ");
        System.out.println();
    }
}

