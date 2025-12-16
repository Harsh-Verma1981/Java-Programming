/* 
Introduction to the user defined Datatype (enum) in java
    LEVEL-1..
*/
// enum Planets {

//     // enum => enumerated(order listing of  items in a collection).
//     MERCURY,
//     VENUS,
//     EARTH,
//     MARS,
//     JUPITER,
//     SATURN,
//     URANUS,
//     NEPTUNE,
//     PLUTO;

// }

// public class Enum {
//     public static void main(String[] argh){
//         Planets myplanet = Planets.MARS;

//         LifePossible(myplanet);// func calling..
//     }

//     static void LifePossible(Planets myplanet){
//         switch (myplanet) {
//             case EARTH:
//                 System.out.println("Life is possible.");
//                 break;
//             case MARS:
//                 System.out.println("Right now Can't be possible but Elon Musk can change it.");
//                 break;
//             default:
//                 System.out.println("Life is not possible");
//                 break;
//         }

//     }
// }


// Intermediate level Enum..
// enum Planets {

//     // enum => enumerated(order listing of  items in a collection).
//     MERCURY(1),
//     VENUS(2),
//     EARTH(3),
//     MARS(4),
//     JUPITER(5),
//     SATURN(6),
//     URANUS(7),
//     NEPTUNE(8),
//     PLUTO(9);

//     int number;

//     Planets(int number){
//         this.number = number;
//     }

// }

// public class Enum {
//     public static void main(String[] argh){
//         Planets myplanet = Planets.EARTH;

//         LifePossible(myplanet);// func calling..
//     }

//     static void LifePossible(Planets myplanet){
//         switch (myplanet) {
//             case EARTH:
//                 System.out.println("Life is possible.");
//                 System.out.println("This is my Planet #" + myplanet.number);
//                 break;

//             case MARS:
//                 System.out.println("Right now It can't be possible but Elon Musk can do this mission.");
//                 System.out.println("This is my Planet #" + myplanet.number);
//                 break;

//             default:
//                 System.out.println("Life is not possible");
//                 System.out.println("This is my Planet #" + myplanet.number);
//                 break;
//         }

//     }
// }

/* LEVEL-2 */

// enum DaysofWeek{
//     // indexing starts from 0 in this ..
//     SUNDAY("Sunday","Raviwar"),// these no are values which was set by user..
//     MONDAY("Monday","Somwar"),
//     TUESDAY("Tuesday","Mangalwar"),
//     WEDNESDAY("Wednesday","Budhwar"),// All of these are the instances of the enum daysofweek
//     THURSDAY("Thursday", "Veerwar"),
//     FRIDAY("Friday", "Shukwar"),
//     SATURDAY("Staurday", "Shaniwar");

//     private DaysofWeek(String lower, String hindi){
//         this.lower = lower;
//         this.hindi = hindi;
//     }

//     public String getlower(){
//         return lower;
//     }

//     public String gethindi(){
//         return hindi;
//     }

//     private String lower;
//     private String hindi;

//     public void ExtraDays(){
//         System.out.println("Day is " + this.lower);
//         System.out.println("Aaj hai " + this.hindi);
//     }

//     public void display(){
//         System.out.println("This is " + this.name());
//     }
// }


// public class Enum{
//     public static void main(String[] argh){
        
//         DaysofWeek today = DaysofWeek.FRIDAY;
//         // int no_of_a_day = today.ordinal();

//         // System.out.println("The index value of today in enum is: "+no_of_a_day);
//         // DaysofWeek Is_exist = DaysofWeek.valueOf("TUESDAY");// throw an exception if the day is not in enum..

//         // System.out.println(Is_exist);

//         // // to print the days of week using array.
//         // DaysofWeek[] values = DaysofWeek.values();

//         // // using for each loop to traverse the enum 
//         // for(DaysofWeek i : values){
//         //     System.out.println("Today is " + i);
//         // }

//         today.display();
//         today.ExtraDays(); 

//         DaysofWeek Holiday = DaysofWeek.MONDAY;

//         switch(Holiday){
//             case MONDAY -> {
//                 System.out.println("M");
//             }
//             case TUESDAY -> {
//                 System.out.println("TU");
//             }
//             case WEDNESDAY -> {
//                 System.out.println("W");
//             }
//             case THURSDAY -> {
//                 System.out.println("TH");
//             }
//             case FRIDAY -> {
//                 System.out.println("F");
//             }
//             default -> {
//                 System.out.println("Week end!");
//             }
//         }

//     }
// }
import java.util.Scanner;

enum Shape {
    SQUARE,
    RECTANGLE,
    TRIANGLE;
}

public class Enum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Shape which area you want: ");
        String st = sc.nextLine();

        st = st.toUpperCase();

        if(st.equals("SQUARE")){
            System.out.print("Enter the Side of square: ");
            int side = sc.nextInt();

            int areaS = side * side;
            System.out.println("The Area of Sqaure: " + areaS);
        }
        else if(st.equals("RECTANGLE")){
            System.out.print("Enter the length: ");
            int length = sc.nextInt();

            System.out.print("Enter the Breadth: ");
            int breadth = sc.nextInt();

            int areaR = length * breadth;

            System.out.println(areaR);
        }

        else if(st.equals("TRIANGLE")){
            System.out.print("Enter the base: ");
            int base = sc.nextInt();

            System.out.print("Enter the height: ");
            int height = sc.nextInt();

            double areaT = 0.5 * (base * height);
            System.out.printf("The Area: %.2f", areaT);
        }
        else{
            System.out.println("Sorry. we don't know about this shape");
        }

        sc.close();
    }
}

