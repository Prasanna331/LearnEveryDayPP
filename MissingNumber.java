Class Solution{
  public int missedInteger(int[] Arr){
    int xor1 =0;
    int x0r2 = 0;
    for(int i=0;i<Arr.length;i++){
      xor1^=Arr[i];
    }
    for(int i =1;i<Arr.length+1;i++){
      xor2^=i;
    }
    return xor1^xor2;
}
