// /* Inheritance in java Programming */
// class Base{
//     public double salary = 159000.78;
// }

// class Derived extends Base{
//     public double bonus = 500000.00;

//     double base_salary = salary + bonus;
//     public void inHand(){

//         System.out.println("The monthly salary is " + salary);
//         System.out.println("The Performance bonus: " + bonus);
//         System.out.println("The base salary of the Employee: " + base_salary);
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {

//         System.out.println("Concepts of Inheritance.." + "\n");

//         Derived Engineer = new Derived();

//         System.out.println("The yearly bonus and the one month salary amount: " + Engineer.base_salary);
//         System.out.println("The monthly Salary is " + Engineer.salary);
//         System.out.println("The Performance bonus on CTC: " + Engineer.bonus + "\n");

//         Engineer.inHand();// calling the inHand method to get the total salary of the Engineer..
//     }
// }

/* Use of Constructors in Inheritance.. */

// class Employee{
//     String job_role;

//     // Default Constructor..
//     Employee(){
//          System.out.println("This is a Base class constructor calling..");// if this constructor is removed complie time error is occured
//         // as there is no defualt constructor forn Employee class so while Executing the defualt constructor of Manager class it didn't have the Employee class defualt constructor this will create an complie time error..
//     }

//     // Parameterized constructor..
//     Employee(String job_role){
//         this.job_role = job_role;
//         System.out.println("The Job role of the Employee in the Company: " + job_role);
//     }

// }

// class Manager extends Employee{
//     String name;

//     // Default constructor..
//     Manager(){
//         System.out.println("This is a Derived class constructor calling.." + "\nThe Base class constructor is calling by default..");
//     }
//     // Parameterized constructor..
//     Manager(String job_role, String name){
//         // if we pass super with a parameter and in the base class no parameterized constructor is there it will throw na error..
//         super(job_role);// if no parameterized constructor is there it will call the default constructor..
//         this.name = name;
//         System.out.println("The Name of the Manager is " + name);
//     }

//     void Greetings(){
//         System.out.println("Hello, Welcome to X or Twitter" + "\nThe Owner of the Company is Elon Musk");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {

//         // the default constructor is calling as there is not argument given to the instances of the classes..

//         // Employee intern = new Employee();// making the instance of the Employee class..
//         // Manager Google = new Manager();// making the instance of the Manager class..

//         Manager X = new Manager("Software Engineer", "Harsh Verma");
//         X.Greetings();

//     }
// }

/* 
        Types of Inheritance
 * Single Inheritance
 * Multi level Inheritance
 * hierarical Inheritance

*/

// Single Inheritance using method overloading and method overriding..

// class Area{

//     // Area(){ // default constructor..
//     //     System.out.println("A Base class constructor has been called.");
//     // }

//     // Method Overriding..
//     public void DefaultArea(){
//         System.out.println("The Area can be calculated by it's sides and acc to it's dimension..");
//     }
// }

// class Rectangle extends Area{
//     int length; int breadth;

//     Rectangle(int length, int breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }
//     // Method Overloading..
//     public void Perimeter(){
//         System.out.println("The Perimeter of the Rectangle: " + 2* (length + breadth) + " m.");
//     }
//     // Method Overloading..
//     public void Perimeter(double len, double br){
//         System.err.println("The Perimeter of the double argument passed by method: " + 2 * (len + br) + " m.");
//     }

//     // Method Overriding..
//     @Override
//     public void DefaultArea(){
//         int Area = length * breadth;
//         System.out.println("The Area of the Rectangle: " + Area + " m sq.");
//     }

// }

// public class Inheritance {
//     public static void main(String[] args) {
//         // Area shape = new Area();
//         // shape.DefaultArea();

//         Rectangle farm = new Rectangle(15, 15);
//         farm.Perimeter();
//         farm.Perimeter(65.89, 32.23);

//         farm.DefaultArea();
//     }
// }

// Multi Level Inheritance using method overloading and method overriding..
class Car{
    public void HorsePower(){
        System.out.println("Every Car is having some Horsepower and torque.");
    }
}

class Engine extends Car{

    // Method Overriding..
    @Override
    public void HorsePower(){
        System.out.println("The V16 Engine has around 1500 Horse Power.");
    }

}

class BMW extends Engine{
    // fields of class Engine
    int year_of_manufacture;
    double milage;

    // Method Overloading..
    public void priceofGas(double patrol){
        System.out.println("The Price of the Petrol is " + patrol + "RS.");
    }

    // Method Overloading..
    public void priceofGas(int diesel){
        System.out.println("The Price of the diesel is " + diesel + "RS.");
    }

    public void HorsePower(){
        System.out.println("The BMW M5 competition has around 1000 HorsePower");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Car skoda = new Car();
        skoda.HorsePower();

        Engine Buggatti = new Engine();
        Buggatti.HorsePower();

        BMW m5 = new BMW();

        m5.priceofGas(79);
        m5.priceofGas(71.21);

        m5.HorsePower();
    }
}
