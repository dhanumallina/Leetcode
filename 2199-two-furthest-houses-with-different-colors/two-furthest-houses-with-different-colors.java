class Solution {
    public int maxDistance(int[] colors) {
      int Hcol=colors[0];
     // int diff=0;
      int maxdiff=0;
      for(int i=0;i<colors.length-1;i++){
        for(int j=i+1;j<colors.length;j++){
            if(colors[i]!=colors[j]){
                int dist=Math.abs(i-j);
                maxdiff=Math.max(dist,maxdiff);
            }
        }
      }
      return maxdiff; 
    }
}