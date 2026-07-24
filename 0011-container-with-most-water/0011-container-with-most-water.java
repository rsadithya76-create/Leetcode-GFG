class Solution {
    public int maxArea(int[] height) {
    
    int right=height.length-1;
    int left =0;
    int max_water=0;
    while(left<right){
        int high=Math.min(height[left],height[right]);
        int distance=right-left;
        int water=high*distance;
        max_water=Math.max(max_water,water);
        if(height[left]<height[right]){
            left++;
        }else right--;

    }
    return max_water;

    }
}