class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
    int count=0;
    for(int i=0;i<stones.length();i++)
    {
        char c=stones.charAt(i);
        boolean found=false;
        for(int j=0;j<jewels.length();j++)
        {
            char ch=jewels.charAt(j);
            if(c==ch)
            {
              found=true;
              break;
            }
        }
        if(found)
        {
            count=count+1;
        }
    }
    return count;
    }
}