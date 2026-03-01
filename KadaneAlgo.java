public class KadaneAlgo {
    public static int[] MaxSumRange(int []arr){

        int currsum = arr[0];
        int maxsum = arr[0];
    
        int idx1 = 0;// start range
        int idx2 = 0;// End range
    
        for(int i = 1;i < arr.length;i++){
            // -2, 1, -3, 4, -1, 2, 1, -5, 4
            //            i         j 
             
            // currsum = Math.max(arr[i], currsum + arr[i]);
            // maxsum = Math.max(maxsum, currsum);
            currsum += arr[i];
    
            if(arr[i] > currsum){
                currsum = arr[i];
                idx1 = i;
                // System.out.print(idx1 + " ");
            }
            // System.out.println();
            if(currsum > maxsum){
                maxsum = currsum;
                idx2 = i;
                // System.out.print(idx2 + " ");
            }
        }

        return new int[]{idx1, idx2};
    }
    public static void main(String[] args){
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // System.out.println("Maximum Sub-array Sum: " + maxsum); // 6 is the output

        int ranges[] = MaxSumRange(arr);

        System.out.println("First Range: " + ranges[0]);
        System.out.println("Last Range: " + ranges[1]);
    }
}
