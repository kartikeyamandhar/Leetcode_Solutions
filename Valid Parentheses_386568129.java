class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character>map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                if(st.isEmpty()||st.pop()!=map.get(c)){
                    return false;
                }
            }
            else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
