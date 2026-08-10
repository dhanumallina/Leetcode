import java.util.*;
class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int ans=0;
        int n=s.length();
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(r-l==3){
                char tc=s.charAt(l);
                hm.put(tc,hm.get(tc)-1);
                if(hm.get(tc)==0){
                hm.remove(tc);
                }
                l++;
        }
            if(hm.size()==3){
                ans++;
            }
        }
        return ans;
    }
}