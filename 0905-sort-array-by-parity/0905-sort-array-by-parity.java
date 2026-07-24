class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int h=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[h];
                nums[h]=nums[i];
                nums[i]=temp;
h++;
            }
            
        }
        return nums;
    }
}