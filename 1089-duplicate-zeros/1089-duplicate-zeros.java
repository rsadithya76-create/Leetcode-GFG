class Solution {
    public void duplicateZeros(int[] arr) {
       ArrayList<Integer>l1=new ArrayList<>();
       int j=0;
       for(int i=0;j<arr.length;i++){
        if(arr[i]==0){
            l1.add(0);
            l1.add(0);
            j+=2;
        }
        else{
            l1.add(arr[i]);
            j++;
        }
       }
       for (int k=0;k<arr.length;k++){
        arr[k]=l1.get(k);
       }
    }
}