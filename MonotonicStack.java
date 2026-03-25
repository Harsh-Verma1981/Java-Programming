import java.util.Stack;
import java.util.Arrays;

public class MonotonicStack {
    /*
    Monolithic stack is a stack that kepps element in some sort of order like smallest to biggest and vice versa..
        There are two flavors:
        Monotonic Increasing — bottom to top goes small → big. If new number is smaller than top, pop until it fits.
        Monotonic Decreasing — bottom to top goes big → small. If new number is bigger than top, pop until it fits.
    */
    public static int[] nextGreaterElement(int[] nums) {

        int n = nums.length;

        // result[i] will store the next greater element for nums[i]
        // We fill it with -1 by default because if no greater element
        // is found, the answer is -1
        int[] result = new int[n];
        Arrays.fill(result, -1);

        // This stack stores INDICES (not values).
        // Why indices? Because when we find the answer for an element,
        // we need to know WHERE to put it in the result array.
        Stack<Integer> stack = new Stack<>();

        // Go through every element left to right
        for (int i = 0; i < n; i++) {

            // While stack is not empty AND the current number is GREATER
            // than the number at the index sitting on top of the stack...
            // ...the current number IS the "next greater element" for
            // whatever is on top of the stack. So pop it and record the answer.
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {

                int poppedIndex = stack.pop();
                // nums[i] is the first number to the right greater than
                // nums[poppedIndex], so store it as the answer
                result[poppedIndex] = nums[i];
            }

            // Now push the current index — we're waiting to find
            // its next greater element in future iterations
            stack.push(i);
        }

        // Any indices still left in the stack never found a greater element
        // Their result stays -1 (already set by Arrays.fill above)
        return result;
    }

    public static int[] DailyTemperatures(int []arr){
        int n = arr.length;
        int res[] = new int[n];// step1 : creating res to store the o/p

        Stack<Integer> st = new Stack<>();

        for(int i = 0;i < n;i++){
          // step 2 : iterating in array and finding the diff for warmer array

            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                int popIdx = st.pop();
                res[popIdx] = i - popIdx; //  difference for warm day 
            }

            st.push(i);
        }

        return res;
    }

    public static int evalRPN(String []tokens){
        Stack<Integer> s = new Stack<>();

        for(String val : tokens){
            if(val.equals("+")){
              s.push(s.pop() + s.pop());
            }
            else if(val.equals("*")){
              s.push(s.pop() * s.pop());
            }
            else if(val.equals("-")){
              int a = s.pop();
              int b = s.pop();

              s.push(b - a);
            }
            else if(val.equals("/")){
              int a = s.pop();
              int b = s.pop();

              s.push(b / a);
            }
            else{
              s.push(Integer.parseInt(val));
            }
        }
        
        return s.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, 4, 2, 5};
        int[] result = nextGreaterElement(nums);

        int temp[] = {72,73,74,76,61,65,78,70};
        int res[] = DailyTemperatures(temp);// o/p => 1,1,1,3,1,1,0,0 

        // System.out.print(Arrays.toString(res));

        String[] tokens = {"4","13","5","/","+"};// 6
        System.out.println(evalRPN(tokens));

        // System.out.println(Arrays.toString(result));
        // Output: [4, 4, 5, 5, -1]
    }
}

/*
## Dry run — step by step

Input: `[3, 1, 4, 2, 5]`
```
i=0, nums[i]=3
  Stack empty, nothing to pop.
  Push index 0.
  Stack: [0]  → represents value [3]
  result: [-1, -1, -1, -1, -1]

i=1, nums[i]=1
  Top of stack = index 0 → value 3.
  Is 1 > 3? NO. Don't pop.
  Push index 1.
  Stack: [0, 1]  → represents values [3, 1]
  result: [-1, -1, -1, -1, -1]

i=2, nums[i]=4
  Top of stack = index 1 → value 1.
  Is 4 > 1? YES. Pop index 1. result[1] = 4  ← "next greater for 1 is 4"
  Top of stack = index 0 → value 3.
  Is 4 > 3? YES. Pop index 0. result[0] = 4  ← "next greater for 3 is 4"
  Stack empty. Stop popping.
  Push index 2.
  Stack: [2]  → represents value [4]
  result: [4, 4, -1, -1, -1]

i=3, nums[i]=2
  Top of stack = index 2 → value 4.
  Is 2 > 4? NO. Don't pop.
  Push index 3.
  Stack: [2, 3]  → represents values [4, 2]
  result: [4, 4, -1, -1, -1]

i=4, nums[i]=5
  Top of stack = index 3 → value 2.
  Is 5 > 2? YES. Pop index 3. result[3] = 5  ← "next greater for 2 is 5"
  Top of stack = index 2 → value 4.
  Is 5 > 4? YES. Pop index 2. result[2] = 5  ← "next greater for 4 is 5"
  Stack empty. Stop popping.
  Push index 4.
  Stack: [4]  → represents value [5]
  result: [4, 4, 5, 5, -1]

Loop ends. Index 4 is still in stack → result[4] stays -1.

Final result: [4, 4, 5, 5, -1]  ✓ 
*/