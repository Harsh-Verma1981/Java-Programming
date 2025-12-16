/* Introduction to class and instances or objects in java programming.. */

class Employee{

    // fields are variables that has been declared in a class..
    private String greetings = "Hello Friends I wish all of you love, joy and happiness";// field in a class
    int salary;

    
    // methods are the functions that has benn declared and defined in a class to perform operation..
    public void GetGreetings(){// A method in a class Employee
        System.out.println(greetings);
    }
}

public class Class {
    public static void main(String[] args){
        // declaring instance of a class Employee..
        Employee Hr = new Employee();// instance or objects of a class Employee..
        Hr.GetGreetings();// using instance to call the GetGreetings method..

        Employee Manager = new Employee();// Another instance
        Manager.GetGreetings();// using Manager instanec to call the method GetGreetings..
    }
}
