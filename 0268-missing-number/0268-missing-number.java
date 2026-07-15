class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        HashSet<Integer>l1= new HashSet<>();
        for(int i:nums){
            l1.add(i);
        }
        for(int j=0;j<n+1;j++){
            if(!l1.contains(j)){
                return j;
            }
        }
        return -1;
    } 
}
