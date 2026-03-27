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
