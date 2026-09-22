import java.util.Scanner;

// abstract class
abstract class Car{
    public abstract void fuel();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class Skoda extends Car
{
    public void fuel()
    {
        System.out.println("Petrol..");
    }
}

class UpdatedSkoda extends Skoda // concrete class
{
    public void fly(){
        System.out.println("Flying..");
    }

}

// interface
interface Map{
    // fields or data members
    int time = 7;// by delfault final and static

    void source();
    void destination();
}

class Route implements Map
{
    public void source(){
        System.out.println("Delhi");
    }

    public void destination(){
        System.out.println("Jalandhar");
    }
}

// super and this keyword
class A
{
    public A(){
        super();
        System.out.println("In A");
    }

    public A(int n){
        super();
        System.out.println("In A int");
    }
}

class B extends A
{
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        // super();
        this();
        System.out.println("In b int");
    }
}

public class Oops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Car car = new Car();// can't create instances of abstract class
        /*Car car = new UpdatedSkoda();
        // all abstract methods must be override it will give error if not
        car.playMusic();
        car.fly();
        car.fuel();*/
        

        /*Map map = new Route();
        map.source();
        map.destination();

        // map.time = 12;

        System.out.println(map.time);*/

        B obj = new B(1);
    }
}
