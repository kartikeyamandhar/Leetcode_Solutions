class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int a=0;
        int b=1;
        while(a<b && b<nums.length){
            sum+=Math.min(nums[a],nums[b]);
            a=a+2;
            b=b+2;
        }
        return sum;
        
        
    }
}
