class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> l1=new ArrayList<>();
        boolean res=true;
        if(s.length()!=t.length()){
            return false;
        }
      char[] sar=s.toCharArray();
      char[] tar=t.toCharArray();
      Arrays.sort(sar);
      Arrays.sort(tar);
      return Arrays.equals(sar,tar);

    }
}

