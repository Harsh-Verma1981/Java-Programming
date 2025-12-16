import java.util.*;
import java.io.*;

public class Buffer {
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        double number = Double.parseDouble(bf.readLine());

        System.out.println(num);
        System.out.println(number);

        bf.close();
    }    
}
