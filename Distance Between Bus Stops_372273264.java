class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        int sum1=0;
        for(int x:distance){
            sum+=x;
        }
        if(start<destination){
        for(int i=start;i<destination;i++){
            sum1+=distance[i];
        }
        }
        for(int i=destination;i<start;i++){
            sum1+=distance[i];
        }
        return Math.min(sum1,sum-sum1);
        
    }
}
