class Solution {
    public int maxDistance(int[] colors) {
     int n=colors.length;
       int maxdiff=0;
      for(int i=0;i<n-1;i++){
          if(colors[i] != colors[0])
    maxdiff = Math.max(maxdiff, i);

if(colors[i] != colors[n-1])
    maxdiff = Math.max(maxdiff, n-1-i); 
    }
      return maxdiff;
}
}