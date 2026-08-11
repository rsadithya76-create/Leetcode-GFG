class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>l1=new HashSet<>();
        while(n!=1 && !l1.contains(n)){
            l1.add(n);
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+(digit*digit);
            n=n/10;
        }
        n=sum;
        
    }
    return n==1 ?true : false;
    }
}