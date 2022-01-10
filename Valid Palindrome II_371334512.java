class Solution {
    public boolean validPalindrome(String s) {
        int a=0;
        int b=s.length()-1;
        while(a<=b){
            if(s.charAt(a)!=s.charAt(b)){
                return solve(s,a+1,b)||solve(s,a,b-1);
                
            }
            a++;
            b--;
            
        }
        return true;
        
    }
    public boolean solve(String s,int i,int j){
        int a=i;
        int b=j;
        while(a<=b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
            
        }
        return true;
        
    }
}
