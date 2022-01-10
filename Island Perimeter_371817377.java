class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return dfs(i,j,grid);
                    
                }
            }
        }
        return 0;
    }
    public static int dfs(int i,int j,int[][] grid){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 1;
        }
        if(grid[i][j]==-1){
            return 0;
        }
        grid[i][j]=-1;
        int count=0;
        count+=dfs(i-1,j,grid);
        count+=dfs(i+1,j,grid);
        count+=dfs(i,j-1,grid);
        count+=dfs(i,j+1,grid);     
        return count;
    }
    
}
