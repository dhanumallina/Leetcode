class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char c=stones.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(hm.containsKey(ch)){
                ans=ans+hm.get(ch);
            }
        }
        return ans;
    }
}   