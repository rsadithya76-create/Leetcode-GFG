class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1=new ArrayList<>();
       Set<Integer> res = new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            l1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(l1.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int arr[]=new int[res.size()];
        int j=0;
        for(int i:res){
            arr[j]=i;
            j++;
        }
        return arr;
    }
}