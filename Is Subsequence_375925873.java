class Solution {
    public boolean isSubsequence(String s, String t) {
    
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        int s1=s.length();
        int t1=t.length();
        return isSub(c1,c2,s1,t1);
        }
    public boolean isSub(char[] c1,char[] c2,int s1,int t1){
       /* if(c1.length==0||c2.length==0){
            return false;
        }
        if(c1.length==0 && c2.length==0){
            return true;
        }*/
        if(s1==0){
            return true;
        }
        if(t1==0){
            return false;
        }
        if(c1[s1-1]==c2[t1-1]){
            return isSub(c1,c2,s1-1,t1-1);
        }else{
            return isSub(c1,c2,s1,t1-1);
        }
    }
}
