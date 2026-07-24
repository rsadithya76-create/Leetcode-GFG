class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=0;
      int j=0;
      int[] res=new int[m+n];
      int h=0;
      while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            res[h++]=nums1[i];
            i++;
        }
        else{
            res[h++]=nums2[j];
            j++;
        }
        
      }
     while (j < n) {
            res[h++] = nums2[j++];
        }
        
        while (i < m) {
            res[h++] = nums1[i++];
        }        
   for(int p=0;p<res.length;p++){
         nums1[p]=res[p];
   }
}
}