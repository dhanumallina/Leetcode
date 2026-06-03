class Solution {
    public String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int n=words.length;
        int ans=0;
        for(int i=0;i<n-1;i++){
            String a=words[i];
            if(a.equals("0")){
                continue ;
            }
            for(int j=i+1;j<n;j++){
            
            String b=words[j];
            // if(a.equals("0")){
            //     break ;
           // }
            String revb=reverse(b);
            if(revb.equals(a)){
             ans++;
             words[j]="0";
             break;
            }
            }
        }
        return ans;
    }
}