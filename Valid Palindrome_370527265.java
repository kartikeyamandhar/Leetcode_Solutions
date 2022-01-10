class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s.toLowerCase());
        //sb.toLowerCase();
        String s1 = sb.toString();
        String s2=sb.reverse().toString();
        ArrayList<Character>list=new ArrayList<>();
        ArrayList<Character>list1=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(Character.isLetterOrDigit(s1.charAt(i))){
                list.add(s1.charAt(i));
            }
        }
        for(int i=0;i<s2.length();i++){
            if(Character.isLetterOrDigit(s2.charAt(i))){
                list1.add(s2.charAt(i));
            }
        }
        return list.equals(list1);
        
    }
}
