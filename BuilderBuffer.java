/* String Builder and String Buffer classes */

import java.util.Scanner;

public class BuilderBuffer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Hello Greetings from Harsh, The Future Software Engineer");
        System.out.println(sb);

    /*Method in string builder class */
        // CharAt at index 0..
        System.out.println(sb.charAt(0));

        // set char at index 0..
        sb.setCharAt(0, 'A');
        System.out.println(sb);// to change the index's value char in memory.. 

        // insert method..
        sb.insert(1, "Java");
        System.out.println(sb);// to insert a char or a String after a particular index..

        // delete method in StringBuilder class..
        sb.delete(1, 3);
        sb.deleteCharAt(2);  
        System.out.println(sb);// to delete the values from startinf index upto last given index - 1..

        // append method..
        sb.append(" Verma");
        sb.append(". ");
        sb.append("W");
        sb.append("e");
        sb.append("l");
        sb.append("c");
        sb.append("o");
        sb.append("m");
        sb.append("e");
        System.out.println(sb);// to insert the value after the last index..

        // length() method of the StringBuilder..
        System.out.println("The length of the String is " + sb.length());

        // reverse method..
        System.out.println("The Reverse String: " + sb.reverse());

        // Using the loops..

        for(int i = 0;i < sb.length() / 2;i++){
                // loop to reverse the front index value with back index value and vice versa..
            int front = i;
            int back = sb.length() - 1 - i;// at 26 - 1 - 0 which is last index and while terminating the loop it will decrement the back i.e. 26 - 1 - 1 and so on....

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }

        System.out.print("Reverse=> ");
        System.out.println(sb);// terminate the String in reverse order..

        // replace method..
        sb.replace(4, 9, "DSA");// replace method is use to replace the external string with given start and end index ranges..
        System.out.println(sb);

        // Subtsring method..
        String a = sb.substring(4);
        System.out.println(a);// to print the string from a specific index..

        String b = sb.substring(5, 9);// to print the string between the specific index..
        System.out.println(b);

        // indexOf and lastIndexOf method..
        String argument = "Verma";
        System.out.println(sb.indexOf(argument));// to find the index of occurence from the start of the String..
        System.out.println(sb.lastIndexOf(argument));// to find the index of occurence from the last of the String..

        // trimToSize method..
        sb.trimToSize();// this method is use to adjust the size or to trim the size 

        // capacity refers to it can by default store upto 16 char values either space consonant or special char
        System.out.println("The capcity is " + sb.capacity());// capacity method is by default 16 it can exceed of the string is large 

        // toString method..
            // to convert the StringBuilder to String..

        String bs = sb.toString();// StringBuilder to String
        System.out.println(bs);

        // StringBuilder sz = new StringBuilder(sc.nextLine());
        // StringBuffer sx = new StringBuffer("Hello");

        // System.out.println(sz.equals(sx));// returns the false..

        // // to remove the duplicates characters from a String..

        String st = "AaaBbbbAABCCcc";
        //st = st.toUpperCase();
        String result = "";

        for(int i = 0;i < st.length();i++){
            String ch = "" + st.charAt(i);
            
            if(result.contains(ch)){
                continue;
            }

            result += ch;

        }
        System.out.println(result + " ");

        sc.close();
    }
}

/*
    Question of a StringBuilder class..
*/

// public class BuliderBuffer {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the String: ");
//         String sentence = sc.nextLine();

//         StringBuilder sb = new StringBuilder(sentence);

//         System.out.println("The length ofthe String is " + sb.length());

//         int countofvowel = 0;
//         for(int i = 0;i < sb.length();i++){
//             char ch = sb.charAt(i);

//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 countofvowel++;
//             }
//         }

//         String s = sb.toString();// conversion to stringbuilder into string..
//         if(countofvowel > 3){
//             s = s.replaceAll("\\s", "");
//             System.out.println(s);
//         }

//         int n = s.length();
//         System.out.println("Size of modified string is: " + n);

//         if(n % 2 == 0){
//             StringBuilder s1 = new StringBuilder(s);

//             s1.reverse();

//             System.out.println(s1);

//         }

//         sc.close();
//     }
// }
