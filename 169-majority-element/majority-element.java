class Solution {
    public int majorityElement(int[] arr) {
        int ans=0;
     for(int i=0;i<arr.length;i++){
	        int count=1;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i]==arr[j]){
	                count++;
	            }
	        }
	                if(count>arr.length/2){
                        ans=arr[i];
                        break ;
	                }
	        }
return ans;
       }  
}