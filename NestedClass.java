// Static Inner Class ..
class A {
    int age;
    
    public void show(int age){
        this.age = age;
        System.out.println("The Age: " + age);
    }

    static class B{
        public void config(){
            System.out.println("I am in Config..");
        }
    }
}

// non-static nested class ..
class Pet{
    public void hair(){
        System.out.println("yes! very silky hair.");
    }

    class Breed{
        public void sound(){
            System.out.println("Dog barks!");
        }
    }
}

// Anoymous inner Class..
class Laptop{
    // method for class laptop
    public void display(){
        System.out.println("This Laptop is made by Lenovo.");
    }
}

// local nested class ...
class Area{
    
    public void area(){
        int no = 12;

        class Square{
            void displayArea(){
                System.out.println("The Area of Square: " + (no * no));
            }
        }

        Square square = new Square();
        square.displayArea();
    }
}

public class NestedClass {
    public static void main(String[] args) {
        A a = new A();
        a.show(19);

        // Static nested class does not need instance to access it's class method 
        // and fields it can be accessed using outer class instance or object..
        // syntax- Outer.Inner instance = new Outer.Inner();
        A.B a1 = new A.B();
        a1.config();

        Pet tom = new Pet();// instance for the outer class
        tom.hair();

        Pet.Breed dog = tom.new Breed();// instance for the non ststic nested class..
        dog.sound();// method call..

        // anonymous class implements to override the method of a class without the inheritance or using extends the class
        // It is like updating the method in the main class before execution soo the updated O/P will printed..

        Laptop lenovo = new Laptop(){
            public void display(){
                System.out.println("This Laptop has 50000 MAh battery.");
            }        
        };
        lenovo.display();

        // local inner class is implemented inside the Outer class method ...
        // In this a inner class is made inside the method like void Area(){} ... 
        Area shape = new Area();
        shape.area();
        
    }
}

// // static nested class 
// class Person{
//     int age = 20;
    
//     class Age{
//         void getAge(){
//             System.out.println("The age of the person: " + age);
//         }
//     }
    
// }

// public class Main {
//     public static void main(String[] args) {
//         // to create the instance of the static class
//         // Person.Age age = new Person.Age();
        
//         // for non static class
//         // 1st creating obj for outer class then for inner class
//         Person person = new Person();
        
//         Person.Age obj = person.new Age();
//         obj.getAge();
    
        
//     }
// }

// class Sample{
//     public int x = 20;
//     // local class
//     void modify(){
//         class Numbers{
//             void show(){
//                 System.out.println("The number: " + x);
//             }
//         }
        
//         Numbers num = new Numbers();
//         num.show();
//     }
// }

// anonymous class
// class Animal{
//     void species(){}
// }

// public class Main {
//     public static void main(String[] args) {
//         // Sample s = new Sample();
//         // s.modify();
        
//         Animal lion = new Animal(){
//             void species(){
//                 System.out.println("The species of the anaimal is Lion.");
//             }
//         };
        
//         lion.species();
//     }
// }