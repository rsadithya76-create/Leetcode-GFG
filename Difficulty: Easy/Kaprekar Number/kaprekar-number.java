class Solution {
	public boolean isKaprekar(int n) {
		// code her
		int c = 0;
		int temp=n;
		while(temp!=0){
		    temp/=10;
		    c++;
		}
		if (n == 1) {
			return true;
			
		}
		int sq = n*n;
		int p = (int)Math.pow(10, c);
		int fir = sq/p;
		int sec = sq%p;
		return(fir + sec == n);
		
	}
};
