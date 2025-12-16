import java.util.ArrayList;
// Generic class to hold any type of value
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Generics {
    public static void main(String[] args) {
        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println(intBox.getItem()); // Prints: 42

        // Box for String
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello");
        System.out.println(strBox.getItem()); // Prints: Hello

        // Generic ArrayList
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(3.14);
        System.out.println(numbers.get(0)); // Prints: 3.14
    }
}

