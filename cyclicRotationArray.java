Class Solution{
  public int[] cyclicrotation(int k, int[] A)
    {
    int[] res = new int[A.length];
    for(int i =0; i<res.length;i++){
      res[(i+k)%A.length] = A[i];
    }
    return res;
      
    }
}
