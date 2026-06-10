class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>hm=new HashMap<>();
        char temp=97;
        String ans="";
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c!=' '&&!hm.containsKey(c)){
                hm.put(c,temp);
                temp++;
            }
        }
        for(int i=0;i<message.length();i++){
            char c=message.charAt(i);
            if(c==' '){
                ans+=' ';
            }else{
            char val=hm.get(c);
            ans+=val; }
    }
    return ans;
}
}