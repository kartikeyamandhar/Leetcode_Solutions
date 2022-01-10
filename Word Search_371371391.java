class Solution {
    public boolean exist(char[][] board, String word) {
        
        if(board.length == 0 || word == null || word.length() == 0) {
        return false;
    }
    boolean[][] isVisited = new boolean[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            if(word.charAt(0) == board[i][j] && ifWordExists(board, word, isVisited, 
                i, j)) {
                return true;
            }
        }
    }
    return false;
}

private boolean ifWordExists(char[][] board, String word, boolean[][] isVisited, int 
    i, int j) {
    if(isVisited[i][j]) {
        return false;
    }
    boolean exists = false;
    isVisited[i][j] = true;
    if(word.length() == 1) {
        return true;
    }
    word = word.substring(1, word.length());
    int[] xDir = new int[] {0, -1, 0, 1};
    int[] yDir = new int[] {-1, 0, 1, 0};
    for(int dir = 0; dir < 4; dir++) {
        int newI = i + xDir[dir], newJ = j + yDir[dir];
        if(newI >= 0 && newI < board.length && newJ >= 0 && newJ < board[0].length) {
            exists = exists || (word.charAt(0) == board[newI][newJ] && ifWordExists
                (board, word, isVisited, newI, newJ));
        }
    }
    if(!exists) {
        isVisited[i][j] = false;
    }
    return exists;
    }
}
