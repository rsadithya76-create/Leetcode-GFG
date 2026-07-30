class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String str:operations){
              if(str.equals("+")){
                 int second=st.pop();
                 int first =st.peek();
                 int third=second+first;
                 st.push(second);
                 st.push(third);
              }
              else if(str.equals("D")){
                int pre=st.peek();
                int sco=pre*2;
                st.push(sco);
              }
              else if(str.equals("C")){
                st.pop();
              }
              else{
                st.push(Integer.parseInt(str));
              }
        }
        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;

    }
}