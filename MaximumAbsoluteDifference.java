/* You are given an array of N integers, A1, A2, .... AN.

*Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
*
*/
public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int max=0;
        for(int i=0;i<A.size();i++){
            int j=A.size()-1;
           while(i<j){
            max = Math.max(Math.abs(A.get(i)-A.get(j))+Math.abs(i-j),max);
             j--;
            }
           

        }
        return max;
    }
}
