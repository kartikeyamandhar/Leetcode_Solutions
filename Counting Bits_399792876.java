class Solution {
    public int[] countBits(int num) {
        int[] arr=new int[num+1];
        for(int i=0;i<=num;i++){
            arr[i]=count(i);
        }
        return arr;
    }
    public int count(int x){
        int count=0;
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(x));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                count++;
            }
        }
        return count;
        
    }
}
