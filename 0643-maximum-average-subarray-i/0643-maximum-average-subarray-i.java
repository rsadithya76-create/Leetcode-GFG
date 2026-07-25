class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=0;
        double window=0;
        for(int i=0;i<k;i++){
            window+=nums[i];
        }
    maxavg=window;
    int start=0;
    int end=k-1;
    while (end<nums.length-1){
           window=window-nums[start];
           start++;
           end++;
           window=window+nums[end];
           maxavg=Math.max(maxavg,window);
    }  
    return maxavg/k;

    }
}