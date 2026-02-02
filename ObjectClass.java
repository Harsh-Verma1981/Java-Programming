import java.util.Scanner;
// Source code to understand the Object class and it's method in Java..
class Laptop{
    
    public String brand;
    public int price;

    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString(){
        return "The Model: " + brand + "\nThe Price: " + price;
    }

    // @Override no need to overridde it will throw an error
    public boolean equals(Laptop obj){
        return brand.equals(obj.brand) && price == obj.price;// == for int values and equals method for string values..
    }

    @Override
    public int hashCode(){
        return brand.hashCode();// returns the memory address in the form of hexadecimal..
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
         * An object Class is a parent of all classes.Every class in Java automatically inherits from the Object class
         * Every user defined class like Manager Employee Car Animal etc has some built in methods.
         * Some Common methods like equals(), toString(), hashCode(), getClass(), clone() etc.
        */

        Laptop lenovo = new Laptop("Lenovo yoga", 50000);
        Laptop HP = new Laptop("Lenovo yoga", 50000);
    
    /* toString() method 
    #By default it is use to convert the objects into String 
    */

        // System.out.println(lenovo);// calling the instance or the object directly means calling the object.toString() method..
        /*Both of the things are Same */
        System.out.println(lenovo.toString());// we are overriding the function to print or display the fields or the values..

    /* equals() method 
    #By defualt it will compare the objects acc to it's hashCode if hashCode is same means true else false 
    */
        System.out.println(lenovo.equals(HP));// we are overriding the method to compare the values are equals or not..

        // hashCode refers to the memory address of the object..
        System.out.println(lenovo.hashCode());
        System.out.println(HP.hashCode());

    /* getClass() method  
    #By default it is use to get the name of the class of it's object..
    */
        
        sc.close();
    }
}
