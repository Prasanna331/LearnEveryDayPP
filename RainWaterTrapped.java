/*
* Problem Description

* Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

* Your task is to calculate the total amount of water that can be trapped in these valleys.

* Example:

* The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int maxtrap=0;
        int[] leftmax = new int[A.length];
        int[] rightmax = new int[A.length];
        int maxleft = 0;
        for(int i=0;i<A.length;i++){
            leftmax[i]=maxleft;
            maxleft = Math.max(A[i],maxleft);
        }
        //   for(int i=0;i<leftmax.length;i++){
        //    System.out.println(leftmax[i]);
        // }
        int maxright = 0;
        for(int i=A.length-1;i>=0;i--){
            rightmax[i]=maxright;
            maxright = Math.max(A[i],maxright);
           
        }
        // System.out.println("=============rightmax===============");
        //  for(int i=0;i<rightmax.length;i++){
        //  //  System.out.println(rightmax[i]);
        // }
        // System.out.println("=============maxtrap===============");
        for(int i=0;i<A.length;i++){
            maxtrap+= Math.max(Math.min(leftmax[i],rightmax[i])-A[i],0);
             //System.out.println(maxtrap);
        }
        return maxtrap;

    }
}
