class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> l1=new ArrayList<>();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            l1.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
         if(l1.contains(stones.charAt(i))){
            count++;
         }
        }
        return count;
    }
}