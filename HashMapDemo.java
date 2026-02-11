import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Introduction to HashMap in java 

        /* 
        it contains two arguments key and values in the form of pair
        it is same as Dict in python 
        Key -> which store all unique elements like ID roll no's etc
        value -> store the data it can bu unique or same etc
        */

        // country(String), population(value) ..
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion 
        map.put("India", 120);
        map.put("USA", 10);
        map.put("France", 8);

        // works in a unordered way..
        // System.out.println(map);

        map.put("India", 7);// update the value of the key..
        System.out.println(map);

        // Search 
        
        // use to check key exist in the Map or not..
        if(map.containsKey("England")){
            System.out.println("Present in the map");
        }
        else{
            System.out.println("Doesn't exist");
        }

        // to get the value of the given key
        int value = map.get("USA");
        // System.out.println(value);
        // System.out.println(map.get("Switzerland"));

        // Iterator 
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.print(e.getKey() + ":");
            System.out.print(e.getValue()+ ", ");
        }
        
        System.out.println();

        // iteration for keys only 
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.print(key + ":" + map.get(key) + "  ");
        }System.out.println();

        // Remove 
        map.remove("USA");
        System.out.println(map);

        // System.out.println(map.keySet(0));

        sc.close();
    }
}
