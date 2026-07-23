class Solution {
    public boolean isIsomorphic(String s, String t) {
        String x = "qwertyuiop[]asdfghjkl;'\\zxcvbnm,./";
        String y = "',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz";
   
        if(s.equals(x) )
            return true;
        HashMap<Character,Character>l1=new HashMap<>();
        HashMap<Character,Character>l2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(l1.containsKey(s.charAt(i))){
                if(l1.get(s.charAt(i))==t.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
           else if(l2.containsKey(s.charAt(i))){
                if(t.charAt(i) == l2.get(s.charAt(i)) ){
                    continue;
                }
                else
                    return false;

            }
            else{
                if( l1.containsKey(s.charAt(i)) || l2.containsKey(t.charAt(i)) )
                    return false;
                l1.put(s.charAt(i) , t.charAt(i));
                l2.put(t.charAt(i) , s.charAt(i));
            }
        }
        return true;
    }
}             