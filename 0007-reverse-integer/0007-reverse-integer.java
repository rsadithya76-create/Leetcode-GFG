class Solution {
    public int reverse(int x) {
        int rev=0;
        int s=0;
        while(x!=0){
            int digi=x%10;
             if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev=rev*10+digi;
            x=x/10;
            s++;
        
        }
        return rev;
    }
}