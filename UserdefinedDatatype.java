// Intorduction to user defined data type.. Struct, union and enum..

// enum Days_of_Week{
//     Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
// }

// public class UserdefinedDatatype {
//     public static void main(String[] args){
//         // making instance of user defined enum as Days_of_Week weekend..
//         Days_of_Week weekend1 = Days_of_Week.Saturday;
//         Days_of_Week weekend2 = Days_of_Week.Sunday;

//         System.out.println("The Weekend is on " + weekend1 + " and " + weekend2);
//     }
// }

// // Example 2--

enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December;
}

public class UserdefinedDatatype {
    public static void main(String[] args){
        // // for instances..
        // Months m1 = Months.January;
        // Months m2 = Months.February;
        // Months m3 = Months.March;
        // Months m4 = Months.April;
        // Months m5 = Months.May;
        // Months m6 = Months.June;
        // Months m7 = Months.July;
        // Months m8 = Months.August;
        // Months m9 = Months.September;
        // Months m10 = Months.October;
        // Months m11 = Months.November;
        // Months m12 = Months.December;

        // System.out.println("Month is " + m1);
        // System.out.println("Month is " + m2);
        // System.out.println("Month is " + m3);
        // System.out.println("Month is " + m4);
        // System.out.println("Month is " + m5);
        // System.out.println("Month is " + m6);
        // System.out.println("Month is " + m7);
        // System.out.println("Month is " + m8);
        // System.out.println("Month is " + m9);
        // System.out.println("Month is " + m10);
        // System.out.println("Month is " + m11);
        // System.out.println("Month is " + m12);

        int x = 10; int y = 20;
        if(x > y){
            if(y > x){
                System.out.println(y);
            }
        }
        else{
            System.out.println(x);
        }
        
    }
}

