class Solution {
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int col=board[0].length;
        int[][] output=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 int neighbour = count(i,j,board);
                //Rule 1
                if(board[i][j]==1 && neighbour<2){
                    output[i][j]=0;
                }
                //Rule 2
                else if(board[i][j]==1 && (neighbour==2 || neighbour==3)){
                    output[i][j]=1;
                }
                //Rule 3
                 else if(board[i][j]==1 && neighbour>3){
                    output[i][j]=0;
                 }
                //Rule 4
                 else if(board[i][j]==0 && neighbour==3){
                    output[i][j]=1;
                 }
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for (int j=0;j<board[i].length;j++)
            {
                board[i][j]=output[i][j];
            }
        }
    }
    public int count(int i,int j,int[][] board){
        int count=0;
        int[][] direction={{0,-1},{0,1},{1,0},{1,-1},{1,1},{-1,-1},{-1,1},{-1,0}};
        for(int[] dir:direction){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && y>=0 && x<board.length && y<board[0].length){
                count+=board[x][y];
            }
        }
        return count;
        
        
    }
        

        
        


}
