import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSetQues {
    public static void findCommonElementsinArray(int []arr1, int []arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : arr1) set1.add(num);
        for(int key : arr2) set2.add(key);

        set1.retainAll(set2);// finding common elements between both arrays
        System.out.println("Common Elements: " + set1);
    }

    public static void findUnique(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int num : arr1) set1.add(num);
        for(int num : arr2) set2.add(num);
        
        set1.removeAll(set2);  // Remove elements present in arr2
        // return new ArrayList<>(set1);
        System.out.println("Common Elements Removal: " + set1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Character> set = new HashSet<>();
        String s = "aaabbbc";

        for(int i = 0;i < s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }            
        }

        set.size();

        set.remove('a');
        
        System.out.println(set);

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};

        findCommonElementsinArray(arr1, arr2);
        findUnique(arr1, arr2);

        int a = Integer.MIN_VALUE;
        System.out.println(a);

        sc.close();
    }
}
