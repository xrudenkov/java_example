import java.io.*;

public class Task16 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("data/Task16"))) {
            String str = br.readLine();
            System.out.println(str);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
