class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] arr=new int[T.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<T.length;i++){
            while(st.size()!=0 && T[i]>T[st.peek()]){
                int index=st.pop();
                arr[index]=i-index;
            }
            st.push(i);
        }
        return arr;
        
    }
}
