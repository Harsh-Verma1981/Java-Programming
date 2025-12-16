import java.io.*;

public class Fileread {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("input.txt");
        BufferedReader bf = new BufferedReader(fr);

        String line;

        while ((line = bf.readLine()) != null) {
            System.out.print(line);
        }

        bf.close();
    }
}
