class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        HashMap<Character,Integer>hmm=new HashMap<>();
        //boolean ans=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
             char cc=t.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,i);
            }
            if(!hmm.containsKey(cc)){
                hmm.put(cc,i);
            }
            if(!hmm.get(cc).equals(hm.get(c))){
              return false;
            }
        }
        return true;
    }
}