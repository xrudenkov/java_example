import java.io.*;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int i=0;
        try(BufferedReader br = new BufferedReader(new FileReader("data/Task18"))){
            String line;
            System.out.println("Вывод содержимого в файле:");
            while ((line = br.readLine()) != null){
                i+=1;
                System.out.println(line);
            }
        }
        catch (IOException exc) {exc.printStackTrace();}

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("data/Task18"))){
            System.out.println("\nВведите новое содержимое в файл:");
            for(int j=0; j<i; j++)
                bw.write(new Scanner(System.in).nextLine() + "\n");
        }
        catch (IOException exc){exc.printStackTrace();}
    }
}
