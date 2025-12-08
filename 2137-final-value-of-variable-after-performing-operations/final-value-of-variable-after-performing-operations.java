class Solution {
    public int finalValueAfterOperations(String[] operations) {
      int ans=0;
      int n=operations.length;
      for(int i=0;i<n;i++){
      String temp=operations[i];
      if(temp.equals("X++") || temp.equals("++X"))
      {
        ans=ans+1;
      }else{
        ans=ans-1;
      }
      }
      return ans;
    //   public static void main(String args[])
    //   {
    //    Solution obj=new Solution();
    //    System.out.println(obj.finalValuAfterOperations("x++","--x","x++"));
    //    }
    }
}