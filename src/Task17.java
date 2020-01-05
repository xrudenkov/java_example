import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввова - строка 'стоп'");

        try (FileWriter fw = new FileWriter("data/Task17")){
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("стоп") == 0) break;
                str = str.concat("\r\n");
                fw.write(str);
            } while (str.compareTo("стоп") != 0);
        }
        catch (IOException ex){ex.getMessage();}
    }
}
