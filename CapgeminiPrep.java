import java.util.*;

/**
 * CapgeminiPrep
 */
public class CapgeminiPrep {
    public static int Vowels(String s){
        int count = 0;

        // s = s.toLowerCase();
        // System.out.println(s);
        String vowel = "AEIOUaeiou";

        for(char ch : s.toCharArray()){
            if(vowel.indexOf(ch) != -1) count++;
        }
        return count;
    }

    public static int CountOnes(int []nums){
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1) {
                curr++; 
                max = Math.max(curr, max);
            } else {
                curr = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int []arr = {4,2,4,5,2,3,5};
        // op => 4,2,5,3

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < arr.length;i++){
            if(!map.containsKey(arr[i])){
                list.add(arr[i]);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int[] op = new int[list.size()];

        for(int i = 0;i < list.size();i++){
            op[i] = list.get(i);
        }

        for(int i : op){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(Vowels("Capgemini 2026"));// 4

        int ones[] = {1,1,0,1,1,1,0,1};
        System.out.println(CountOnes(ones));// 3

        

    }
}