import java.util.*;

public class HashingQues{
    public static void majorityElement(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){ // for true
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        // for(int key : map.keySet()){
        //     if(map.get(key) > n/3){
        //         System.out.print(key + ".");
        //         // return new int[]{key};
        //     }
        // }

        System.out.println(map);

        int res = Collections.max(map.values());
        System.out.println(res);

    }
    public static void main(String[] argh){
        int nums[] = {1,3,2,5,1,3,1,5,1};
        /* majority element ques */
        majorityElement(nums);
    }
}

