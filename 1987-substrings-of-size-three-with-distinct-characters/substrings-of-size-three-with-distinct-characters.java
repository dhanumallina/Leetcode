import java.util.*;
class Solution {
    public boolean fun(String s,int k){
        HashSet<Character> hs=new HashSet<>();
        int m=s.length();
        for(int i=0;i<m;i++){
            hs.add(s.charAt(i));
        }
        if(hs.size()==k){
            return true;
        }
        return false;
    }
    public int countGoodSubstrings(String s) {
        int ans=0;
	    int k=3;
	    for(int i=0;i<s.length()-k+1;i++){
	        boolean temp=fun(s.substring(i,i+k),k);
	        if(temp){
	        ans++;
	    }
	    }
        return ans;
    }
}