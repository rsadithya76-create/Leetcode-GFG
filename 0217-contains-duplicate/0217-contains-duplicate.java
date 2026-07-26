class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> l1 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            l1.add(nums[i]);
        }
        return nums.length != l1.size();
    }
}