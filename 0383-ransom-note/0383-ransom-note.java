class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    ArrayList<Character> l1=new ArrayList<>();
    for(int i=0;i<magazine.length();i++){
        l1.add(magazine.charAt(i));
    }
    for(int i=0;i<ransomNote.length();i++){
        if(l1.contains(ransomNote.charAt(i))){
           l1.remove(Character.valueOf(ransomNote.charAt(i)));
        }
        else{
             return false;
        }
    }
    return true;
    }
}