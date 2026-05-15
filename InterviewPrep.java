import java.util.Arrays;

public class InterviewPrep {
    public static int[] countSmallerToRight(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Pair each value with its original index
        // because merge sort will move elements around
        int[][] indexed = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexed[i][0] = nums[i];  // value
            indexed[i][1] = i;         // original index
        }
        
        mergeSort(indexed, result, 0, n - 1);
        return result;
    }

    private static void mergeSort(int[][] indexed, int[] result, int left, int right) {
        if (left >= right) return;
        
        int mid = left + (right - left) / 2;
        mergeSort(indexed, result, left, mid);
        mergeSort(indexed, result, mid + 1, right);
        merge(indexed, result, left, mid, right);
    }

    private static void merge(int[][] indexed, int[] result, int left, int mid, int right) {
        int[][] temp = new int[right - left + 1][2];
        int i = left;      // pointer for left half
        int j = mid + 1;   // pointer for right half
        int k = 0;         // pointer for temp array

        while (i <= mid && j <= right) {
            if (indexed[i][0] > indexed[j][0]) {
                // All elements from j to mid+1 on the right
                // are smaller than indexed[i]
                result[indexed[i][1]] += (right - j + 1);
                temp[k++] = indexed[i++];
            } else {
                temp[k++] = indexed[j++];
            }
        }

        while (i <= mid) temp[k++] = indexed[i++];
        while (j <= right) temp[k++] = indexed[j++];

        // Copy back to original array
        for (int l = 0; l < temp.length; l++) {
            indexed[left + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 4};
        int[] result = countSmallerToRight(nums);
        System.out.println(Arrays.toString(result));
        // Output: [2, 1, 0, 0]
    }
}
