import java.util.Scanner;
// import org.apache.commons.lang3.StringUtils;

// class CapitalizeWithLibrary {
//     public void firstCapitalLetter() {
//         String input = "apache commons";
//         // This method only capitalizes the first word in the sentence
//         String output = StringUtils.capitalize(input); 
//         System.out.println(output); // Output: Apache commons
//     }
// }

public class Temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // CapitalizeWithLibrary word = new CapitalizeWithLibrary();

        // word.firstCapitalLetter();
        
        // String s1 = sc.nextLine();
        // // sc.nextLine();
        
        // String s2 = sc.nextLine();
        
        // int sum = s1.length() + s2.length();
        
        // System.out.println(s1 + "\n" + s2);

        // s1 = s1.toUpperCase();
        // System.out.println(s1);

        String s = "abcadbcd";int count = 0;
        String p = "cab";
        // counting anagrams
        int index = s.indexOf(p);
        
        System.out.println(index);

        StringBuilder sb = new StringBuilder();

        sc.close();
    }
}
