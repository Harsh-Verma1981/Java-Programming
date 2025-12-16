import java.util.*;

public class StringIntro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    // Introduction to Strings in java programming..

        System.out.print("Enter the Sentence or the word: ");
        String name = sc.nextLine();

        System.out.println("Your given string is " + name);

    /* Functions in String.. */
        // concatenation method..

        String first_name = "Harsh"; 
        String last_name = "Verma";

        String full_name = first_name + " " + last_name;// variable to concatenate the string..

        System.out.println("Your Name is " + full_name);// concatenation refers to adding two or more string to get a new o/p or a new String

        // length of a string..

        String movie = "Bhool Bhulaiyaa";
        System.out.println(movie.length());// use to get the no of char used in a string including spaces and specChar

        // charAt method..

        String hero = "Batman";
            // charAt method is use to get the particular index char value in a string
        for(int i = 0;i < hero.length();i++){
            //traversing the all of the char values that is present in hero string 
            System.out.print(hero.charAt(i));

            if(i < hero.length()){
                System.out.print(" ");
            }
        }
        System.out.println();

        // compare method in String..

        String westcountry = "China";
        String mycountry = "India";

            // compare method is use to comapare the two strings if equal then it is 0 if string 1 > string 2 then it return +ve number else it will return any negative number 
        if(westcountry.compareTo(mycountry) == 0){
            System.out.println("Both countries are same");
        }
        else if(westcountry.compareTo(mycountry) >= 1){
            System.out.println(westcountry + " is greater than " + mycountry);
        }
        else{
            System.out.println(westcountry + " is less than " + mycountry);
        }
            // we don't use == operator to compare two strings
            // because it will give us wrong ans or fail any test cases..Here is the example:-
        if(new String("Tony") == new String("Tony")){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }

        // substring method..
        
        String sentence = "Hello, May you have a good day.";
        System.out.println(sentence.length());
        String Substr = sentence.substring(0,7);

        System.out.println(Substr);

        // endsWith method in string..

        String sample = "Hello World!";
        System.out.println(sample.endsWith("ld!"));// return true or false if the given string is present in the end or not 

        // contain method [learn about it.]..
        String sb = ("Hello developers. I am learning java programming");
        String s1 = "developers";

        System.out.println(sb.contains("Hello"));// returns the output as boolean if exists then true else false..

        if(sb.contains(s1)){
            System.out.println("Substring exists");// it will print this statement..
        }
        else{
            System.out.println("substring does not exists");
        }

        // format method in String..
            // Examples of String formatting
        int no = 27;
        String getThreeDigitNo = String.format("%03d", no);// to get the no as three digit no
        System.out.println(getThreeDigitNo);
        // String format is use to give the format or text-align or give padding or like it helps to describe the structure and behavior of the string
        // like these example's use it to to get the 2 decimal values for o/p or we get three digit no if we have 2 digit no
        double value = 3.14159;
        String result = String.format("%.2f", value);
        System.out.println(result); // Outputs: 3.14

        // padding example of string format
        String spaces = String.format("|%10s|", "text");// for left alignment but for right alignment we need to use - in %-10s
        System.out.println(spaces);

        // // contain method in java programming..
        // Java Program to demonstrate working contains() method
      
        String s = "My name is GFG";
        System.out.println(s.indexOf("n"));


        System.out.println(s.contains("GFG"));// this method is use to find a sequence of chars in a String..
        System.out.println(s.contains("geeks"));// returns the o/p in terms of true and false..

        String sntnc = "    He    l     l    o     W      o     R     l     d!  ";
        sntnc = sntnc.replaceAll("\\s", "");

        System.out.println("The Sentence after removing spaces : " + sntnc);
        
        // equalsTo method..
        String sr = "Match";
        String st = "Match";

        System.out.println(sr.equals(st));// returns the output as the boolean value either true or false..

        // toCharArray() method..
        String java = "Java,Programming";

        char[] word = java.toCharArray();// use to convert the given string into the array..

        for(char c : word){
            System.out.print(c + "->");
        }System.out.println();

        // Character.isLetter() and Character.isDigit() method ..
        char a = 'A'; char on = '1';
        System.out.println(a + " is a digit: " + Character.isLetter(a));
        System.out.println(on + " is a digit: " + Character.isDigit(on));// use to check if the char value is the number or not..
        System.out.println(Character.isLetterOrDigit(1));
        sc.close();
    }
}