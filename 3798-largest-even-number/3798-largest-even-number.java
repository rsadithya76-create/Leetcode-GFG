class Solution {
    public String largestEven(String s) {
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            char c=s.charAt(i);
            if((c-'0')%2==0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}