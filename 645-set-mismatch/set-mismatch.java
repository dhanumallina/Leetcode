class Solution {
    public int[] findErrorNums(int[] nums) {
       HashSet<Integer>hs=new HashSet<>();
       int[] ans={0,0};
      // Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(!hs.contains(nums[i])){
        hs.add(nums[i]);
        }else if(hs.contains(nums[i])){
            ans[0]=nums[i];
        }
        if(!hs.contains(i+1)){
            ans[1]=i+1;
        }
       }
       for(int i=1;i<=nums.length;i++){
        if(!hs.contains(i)){
            ans[1]=i;
        }
       }  
       return ans;
    }
}