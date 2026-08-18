class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        String str="";
        para(0,0,n,str,res);
        return res;
    }
    public void para(int ob,int cb,int n,String str,List<String> res){
            if(str.length()==2*n){
                res.add(str);
                return;
            }
            if(ob<n) para(ob+1,cb,n,str+'(',res);
            if(cb<ob) para(ob,cb+1,n,str+')',res);      
        }
}