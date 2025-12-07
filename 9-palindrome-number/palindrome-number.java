class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String s=Integer.toString(x);
        int n=s.length();
      boolean palindrom=true;
      for(int i=0;i<=n/2;i++)
      {
      if(s.charAt(i)!=s.charAt(n-i-1))
      {
        return false;
      }
      }
      return true;
    }
      public static void main(String args[])
      {
        Solution obj=new Solution();
        System.out.println(obj.isPalindrome(121));
      }
} 