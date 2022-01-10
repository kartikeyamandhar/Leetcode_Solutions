class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        Stack<Character>st=new Stack<>();
        for(char a:c){
            if(isVowel(a)){
            st.push(a);
            }
        }
        for(int i=0;i<c.length;i++){
            if(isVowel(c[i])){
                c[i]=st.pop();
            }
        }
        return new String(c);
    }
    public boolean isVowel(Character a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a
            =='U'){
            return true;
        }
        return false;
    }
}
