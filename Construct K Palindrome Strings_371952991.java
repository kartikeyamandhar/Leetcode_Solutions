class Solution {
    public boolean canConstruct(String s, int k) {
        if(k==s.length()){
            return true;
        }
        if(k>s.length()){
            return false;
        }
        HashSet<Character>set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(set.size()<=k){
            return true;
        }
        return false;
        
    }
}
