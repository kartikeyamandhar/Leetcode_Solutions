class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        int[] char_counts=new int[26];
        for(char c:chars.toCharArray()){
            char_counts[c-'a']++;
        }
        
        for(String str:words){
            int[] temp_char_counts=Arrays.copyOf(char_counts,char_counts.length);
            int valid_char_count=0;
            for(char c1:str.toCharArray()){
                if(temp_char_counts[c1-'a']>0){
                    valid_char_count++;
                    temp_char_counts[c1-'a']--;                 
                }
            }
            if(valid_char_count==str.length()){
                sum+=str.length();
            }
        }
        return sum;
    }
}
