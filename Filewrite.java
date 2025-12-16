import java.io.*;
import java.util.*;

public class Filewrite {
    public static void main(String[] args) throws  IOException{
        FileWriter fw = new FileWriter("input.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("I am Harsh Verma");
        bw.newLine();
        bw.write("I am a developer");
        
        // fw.close();
        bw.close();
        
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        
        while((line = br.readLine()) != null){
            System.out.print(line);
        }

        // fr.close();
        br.close();
    }
}
