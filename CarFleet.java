import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public static int FleetsOfCar(int target, int[] position, int[] speed){
        int n = position.length;

        int[][] cars = new int[n][2];

        for(int i = 0;i < n;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // When i=0:  cars[0][0]=10,  cars[0][1]=2
        // When i=1:  cars[1][0]=8,   cars[1][1]=4
        // When i=2:  cars[2][0]=0,   cars[2][1]=1
        // When i=3:  cars[3][0]=5,   cars[3][1]=1
        // When i=4:  cars[4][0]=3,   cars[4][1]=3

        Arrays.sort(cars, (a , b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();

        for(int []car : cars){
            int pos = car[0];
            int spd = car[1];

            double time = (target - pos) / spd;

            if(stack.isEmpty() || (time > stack.peek())){
                stack.push(time);
            }
        }

        return stack.size();
    }
    public static void main(String[] args) {
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        int target = 12;

        System.out.println(FleetsOfCar(target, position, speed));// 3
    }
}
