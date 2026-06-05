class Solution {
    public int maximumDifference(int[] nums) {
       int maxdiff=-1;
         int low=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>low){
             maxdiff=Math.max(maxdiff,(nums[i]-low));
            }
             low=Math.min(low,nums[i]);
                }
        return maxdiff;
    }
}

