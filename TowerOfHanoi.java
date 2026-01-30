import java.util.*;
import java.io.*;

public class TowerOfHanoi(String[] args){
  public static void main(){
    Toh(4,'A','B','C');
  }
  public static void Toh(int n, char S, char T, char D){
    if(n==1){
      System.out.println("Disk" +n+" is moved from "+S+" to"+D);
      return;
    }
    Toh(n-1,S,D,T);
    System.out.println("Disk" +n+" is moved from "+S+" to"+D);
    Toh(n-1,T,S,D);
  }
}
