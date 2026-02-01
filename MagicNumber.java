import java.util.*

public class MagicNumber {
  public static void main(String[] args){
    solve();
  }
    public static int solve(int A) {
        int sum = sumofdigits(A);
        while(sum>9){
         sum = sumofdigits(sum);
        }
        if(sum==1){
            return 1;
        }
        return 0;
       

    }
    public static int sumofdigits(int A){
        if(A<9){
            return A;
        }
        int digit = A%10;
        return digit+sumofdigits(A/10);
    }
}
