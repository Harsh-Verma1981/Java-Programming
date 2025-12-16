@FunctionalInterface
interface A{
    void show(int i, int j);
}

@FunctionalInterface
interface B{
    int display(int value);
}

public class lambdaExpress {
    public static void main(String[] args) {
        A obj = (i, j) -> System.out.println("In show " + i + " and "+ j);

        obj.show(5, 8);

        B ob = (k) -> 
        {   
            int count = 0;
            for(int i = 1; i <= k;i++){
                if(k % i == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println("the " + k + " is an prime no.");
                return k;
            }
            else{
                System.out.println(k + " is an Odd no.");
            }

            return -1;
        };

        int result = ob.display(17);
        System.out.println(result);
        
    }
}
