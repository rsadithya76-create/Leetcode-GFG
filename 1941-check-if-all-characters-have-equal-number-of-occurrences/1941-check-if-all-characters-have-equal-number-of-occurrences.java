class Solution {
    public boolean areOccurrencesEqual(String s) {
    HashMap<Character,Integer>hs=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char j=s.charAt(i);
        if(hs.containsKey(j)){
            hs.put(j,hs.get(j)+1);
        }
        else{
            hs.put(j,1);
        }
    }   
    int count=hs.get(s.charAt(0)); 
    for(Character i:hs.keySet()){
           if(hs.get(i)!=count)
           {
            return false;
           }
    }
    return true;
    }
}