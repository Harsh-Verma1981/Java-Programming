public class Master{
  public static int BinaryExpo(int a, intb){
    int ans = 1;
    while(b > 0){
      if(b % 2 == 1){
            ans = ans * a;
      }
      a = a * a;
      b = b / 2;
      
    }
    return ans;
  }
  public static void main(String[] argh){
    int result = BinaryExpo(5, 5);
    System.out.println(result);// op is 3125
    
  }
}
