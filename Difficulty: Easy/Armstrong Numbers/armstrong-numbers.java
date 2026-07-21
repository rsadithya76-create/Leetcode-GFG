class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int temp=n;
        while (n!=0){
            int digi=n%10;
            sum=sum+(digi*digi*digi);
            n=n/10;
            
        }
    return temp==sum;
    }
}