class Solution {
    public int maxArea(int[] height) {
        int area=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                area=Math.max(area,Math.min(height[i],height[j])*(j-i));
            }
            
        }
        return area;
        
    }
}
