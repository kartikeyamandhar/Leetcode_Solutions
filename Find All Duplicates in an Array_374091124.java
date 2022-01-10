class Solution {
   public List<Integer> findDuplicates(int[] nums) {
         
        
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            if(x.getValue()>1)
                result.add(x.getKey());
        }
    return result;
    }
}
