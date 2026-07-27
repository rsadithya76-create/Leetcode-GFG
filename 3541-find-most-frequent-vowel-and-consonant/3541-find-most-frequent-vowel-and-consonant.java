import java.util.HashMap;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowels = new HashMap<>();
        HashMap<Character,Integer> con = new HashMap<>(); 
        vowels.put('a',0);
        vowels.put('e',0);
        vowels.put('i',0);
        vowels.put('o',0);
        vowels.put('u',0);
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(vowels.containsKey(x)){
                vowels.put(x, vowels.getOrDefault(x, 0) + 1);
            }
            else{
                con.put(x, con.getOrDefault(x, 0) + 1);
            }
        }
        
        int maxv = 0;
        int maxc = 0;
        for(char i : vowels.keySet()){
            maxv = Math.max(maxv, vowels.get(i));
        }
        for(char i : con.keySet()){
            maxc = Math.max(maxc, con.get(i));
        }
        return maxc + maxv;
    }
}
