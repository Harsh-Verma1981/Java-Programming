import java.util.ArrayList;

public class ToDArraylist {
    public static void main(String[] argh){
        // 2D Arraylist = dynamic list of lists
        // memory management is done at run time 

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakerylist = new ArrayList<String>();
        bakerylist.add("bread");
        bakerylist.add("cup cake");
        bakerylist.add("pasta");

        System.out.println(bakerylist.get(0));
        
        ArrayList<String> producelist = new ArrayList<String>();
        producelist.add("tomatoes");
        producelist.add("cheese");
        producelist.add("peppers");
        
        System.out.println(producelist.get(0));

        ArrayList<String> drinkslist = new ArrayList<String>();
        drinkslist.add("soda");
        drinkslist.add("coffee");
        drinkslist.add("juice");
        
        System.out.println(drinkslist);

        groceryList.add(bakerylist);
        groceryList.add(producelist);
        groceryList.add(drinkslist);

        System.out.println(groceryList);
        
        // if we want to execute the one list among all list..
        System.out.println(groceryList.get(2));// using get method to get or print the first list..

        // to get the fist element from the first list 
        System.out.println(groceryList.get(1).get(2));

        // String s = "Hello there";
    }
}
