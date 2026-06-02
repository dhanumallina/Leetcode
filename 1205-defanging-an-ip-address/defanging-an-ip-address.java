class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++){
            char a=address.charAt(i);
            if(a=='.'){
                ans=ans+"[.]";
            }else{
                ans=ans+a;
            }
        }
        return ans;
    }
}