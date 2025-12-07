class Solution 
{
    public int scoreOfString(String s) 
    {
    int n=s.length();
    int ans=0;
        for(int i=0;i<n-1;i++)
        {
        int a=i;
        int b=i+1;
        char car=s.charAt(i);
        char carr=s.charAt(i+1);
        int fst=car;
        int snd=carr;
        //int temp=fst-snd;
       int temp= Math.abs(fst-snd);
        ans=ans+temp;
        }
        return ans;
    }
        public static void main(String args[])
        {
            Solution obj=new Solution();
            System.out.println(obj.scoreOfString("hello"));
        }    
    
}