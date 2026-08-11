class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> l1=new HashMap<>();
        for(int i :nums){
            l1.put(i, l1.getOrDefault(i, 0) + 1);
        }
        int target =nums.length/2;
        for(int i:l1.keySet()){
            if (l1.get(i) > target) {
                return i;
        }
        
    }return -1;
}
}