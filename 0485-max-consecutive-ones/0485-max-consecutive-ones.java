class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int res=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                list.add(count);
                count=0;
            }
             
        }
        list.add(count);
        return Collections.max(list);
    }
}