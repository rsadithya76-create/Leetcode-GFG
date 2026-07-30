class Solution {
    public boolean isValid(String s) {
       Stack <Character> st = new Stack<>();
       boolean flag =true;
       if(s.length()==0 ||s.length()==1 ){
        return false;
       }
       for(int i=0;i<s.length();i++){
        char x=s.charAt(i);
        if(x=='(' || x=='{' || x=='['){
            st.push(x);

        }else{
            if (!st.isEmpty() && ( (x == ')' && st.peek() == '(') || (x == '}' && st.peek() == '{') || (x == ']' && st.peek() == '[') )) {
                 st.pop();
}
            else{
                flag=false;}
        }
       }
       if(st.isEmpty() && flag){
        return true;
       }
       else{
        return false;
       }
    }
}