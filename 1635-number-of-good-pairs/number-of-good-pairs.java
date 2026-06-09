class Solution {
    public int numIdenticalPairs(int[] arr) {
       HashMap <Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
           if(hm.containsKey(arr[i])){
            ans=ans+hm.get(arr[i]);
            hm.put(arr[i],hm.get(arr[i])+1);
           }else{
            hm.put(arr[i],1);
           }
    }
return ans;
}
}