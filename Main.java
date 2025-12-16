// /* Source code to check the number is armstrong or not.. */
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // System.out.println("Try programiz.pro");
        
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the no to check either it is Armstrong or not: ");
//         int armNo = sc.nextInt();
        
//         int temp = armNo;
        
//         int count = 0; 
//         int sum = 0;
        
//         while(temp != 0){
//             // int digit = temp % 10;
//             count++;
//             temp = temp / 10;
//         }
        
//         temp = armNo;// reset it again..
        
//         while(temp != 0){
//             int digit = temp % 10;
//             // count++;
//             double getvalues = Math.pow(digit, count);
//             int getValue = (int)getvalues;
            
//             sum += getValue;
            
//             temp = temp / 10;
            
//         }
        
//         System.out.println("No of digits: " + count + "\n");// giving the correct no of digits in the number..
        
//         // System.out.println(sum + "<->");
        
//         if(sum == armNo){
//             System.out.println(sum + " is a Armstrong number");
//         }
//         else{
//             System.out.println(sum + " is not a Armstrong number");
//         }
        
//         sc.close();
//     }
// }


// class A{}
// class B extends A{}
// class C extends A{}

// public class Main {
//     public static void main(String[] args) {
//         // System.out.println("Try programiz.pro");
//         A obj = new C();
//         B obj1 = (obj instanceof B) ? (B) obj : null;
        
//         if(obj1 == null){
//             System.out.println("Obj1 is null, so casting is not happening.");
//         }
//         else{
//             System.out.println("Casted Successfully.");
//         }
        
//     }
// }

// You are using Java
import java.util.Scanner;

// class Student {
//       //type your code here
//     public double percentage;//field of a class..
    
//     // method of a base class to override in derived class..
//     public double calculatePercentage(int TotalMarks, int obtainedMarks){
//         double percentage = ((obtainedMarks / TotalMarks) * 100);
        
//         return percentage;
//     }
    
// }

// class ScholarshipStudent extends Student {
//       //type your code here
//     public double updatedPercent;// field of a class..
    
//     // method overriding..
//     public double calculatePercentage(int TotalMarks, int obtainedMarks){
        
//         updatedPercent = ((obtainedMarks / TotalMarks) * 100);
//         updatedPercent += 5;
        
//         return updatedPercent;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Student student = new Student();
//         ScholarshipStudent scholarshipStudent = new ScholarshipStudent();

//         int totalMarks = scanner.nextInt();
//         int obtainedMarks = scanner.nextInt();

//         double studentPercentage = student.calculatePercentage(totalMarks, obtainedMarks);
//         double scholarshipStudentPercentage = scholarshipStudent.calculatePercentage(totalMarks, obtainedMarks);

//         System.out.printf("Student Percentage: %.2f%%\n", studentPercentage);
//         System.out.printf("Scholarship Student Percentage: %.2f%%\n", scholarshipStudentPercentage);

//         scanner.close();
//     }
// }

class Regular{
    public double Discount;
    public double calculatePrice(double price){
        // to give the user 10 % discount..
        double rate = (price / 100) * 10;

        Discount = price - rate;

        return Discount;
    }
}

class Holiday extends Regular{
    public double newDiscount;

    public double calculatePrice(double Price){
        // to give the user extra 5 % discount on holidays..
        double Discountprev = (Price / 100) * 10;

        newDiscount = Price - Discountprev;

        double extraDiscount = (newDiscount / 100) * 5;

        return (newDiscount - extraDiscount);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Regular Price = new Regular();
        Holiday specPrice = new Holiday();

        System.out.print("Enter the Price of The item purchasing by the user: ");
        double price1 = 50.0; //sc.nextDouble();

        double RegularPrice = Price.calculatePrice(price1);
        double HolidayPrice = specPrice.calculatePrice(price1);

        System.out.printf("Regular Price: %.2f%n", RegularPrice);
        System.out.printf("Holiday Price: %.2f%n", HolidayPrice);

        sc.close();
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// class Outer{
//     static int staticVar = 20;
    
//     static class StaticNested{
//         void display(){
//             System.out.println("Static variable: " + staticVar);
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Object Class and ");
        
//         Outer.StaticNested nested = new Outer.StaticNested();
//         nested.display();
        
//     }
// }

// interface Worm {
//     int teeth=2;
// }

// class BookWorm implements Worm {
//     int teeth=4;
//     void show() {
//         teeth= 5;
//         System.out.println("Teeth: " + teeth);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         new BookWorm().show();
//     }
// }

// interface Calculate {
//     int VAR = 0;
//     void cal(int item);
// }

// class Display implements Calculate {
//     int x;

//     public void cal(int item) {
//         if (item < 2)
//             x = VAR;
//         else
//             x = item * item;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Display[] arr = new Display[3];
//         for (int i = 0; i < 3; i++)
//             arr[i] = new Display();
//         arr[0].cal(0);
//         arr[1].cal(1);
//         arr[2].cal(2);
//         System.out.print(arr[0].x + " " + arr[1].x + " " + arr[2].x);
//     }
// }
