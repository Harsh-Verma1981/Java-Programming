import java.util.Scanner;

public class StringParenthesis {
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String res = sc.nextLine();

        int open = 0;
        int close = 0;

        int noofMissMatch = 0;

        for(int i = 0;i < n;i++){
            if(res.charAt(i) == '('){
                open++;
            }
            else close++;

            if(open < close){
                noofMissMatch++;
                open = close;
            }
        }

        System.out.println(noofMissMatch);
    }
}
