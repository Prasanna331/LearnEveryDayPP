Class Solution{
  public int binaryGap(int N){
    int maxGap = 0;
    int currentGap =0;
    boolean counting = false;
   while(N > 0){
     if(N & 1 == 1){
     if(counting){
       maxGap = Integer.max(currentGap, maxGap);
     }
       counting = true;
       currentGap = 0;
     }
     else if(counting){
       currentGap++;
     }
     N >>= 1;
   }
    return maxGap;
  }   
}
