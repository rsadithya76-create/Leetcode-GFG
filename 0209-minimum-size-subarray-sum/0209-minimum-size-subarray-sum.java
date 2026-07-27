class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window=nums[0];
        int start=0;
        int end=0;
        int minl=Integer.MAX_VALUE;
        if(nums.length==1 && window > target){
               return 1; 
             }
        else if(nums.length==1 && window < target) return 0;
        while(end<nums.length-1){
             
             if(window<target ){
             end++;
             window+=nums[end];
             }
            while(window>=target){
                minl=Math.min(end-start+1,minl);
                window=window-nums[start];
                start++;
            }
        }
        return minl==Integer.MAX_VALUE ?0:minl;
    }
}