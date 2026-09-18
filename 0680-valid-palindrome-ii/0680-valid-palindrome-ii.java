class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean res= true;
        char[] arr=s.toCharArray();
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                return( ispa(arr,i+1,j) || ispa(arr,i,j-1));
            }

        }
        return res;
    }
    public boolean ispa(char[] arr,int i,int j){
        while(i<j){
        if(arr[i]!=arr[j]){
            return false;
        }
        i++;
        j--;

    }
    return true;
    }
}