import java.util.*;
public class GreyCode{
  public static void main(String[] args){
    System.out.println(greycode(3));
  }
  public static List<Integer> greycode(int n){
    List<Integer> ans = new ArrayList<>();
    if(n==1){
      List<Integer> a = new ArrayList<>();
      a.add(0);
      a.add(1);
      return a;
    }
    List<Integer> temp = greycode(n-1);
    for(int i=0;i<temp.size();i++)
      {
        ans.add(temp.get(i));
      }
     for(int i=temp.size();i>0;i--)
      {
        ans.add(temp.get(i)+(1<<(n-1)));
      }
    return ans;
      
}
