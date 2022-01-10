class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        back(res,"",0,0,n);
        return res;
    }
    public void back(List<String> res,String cur,int open,int close,int max){
        if(cur.length()==max*2){
            res.add(cur);
            return;
        }
        if(open<max){
            back(res,cur+"(",open+1,close,max);
        }
        if(close<open){
            back(res,cur+")",open,close+1,max);
        }
    }
}
