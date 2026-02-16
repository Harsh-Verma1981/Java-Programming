public class KadaneAlgo {
    public static void main(String[] args){
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currsum = arr[0];
        int maxsum = arr[0];

        for(int i = 1;i < arr.length;i++){
            currsum = Math.max(arr[i], currsum + arr[i]);
            maxsum = Math.max(maxsum, currsum);
        }

        System.out.println("Maximum Sub-array Sum: " + maxsum); // 6 is the output
    }
}
