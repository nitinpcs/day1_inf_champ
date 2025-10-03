class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(helper(board,i,j,board.length-1,board[0].length-1,word,0)) return true;                }
            }
        }
        return false;
    }

    public boolean helper (char[][] board,int cr, int cc, int er, int ec, String word, int idx){
        if(idx == word.length()){
            return true;
        }
        if(cr < 0 || cr > er || cc < 0 || cc > ec){
            return false;
        }
        char ch = board[cr][cc];
        if(ch == word.charAt(idx)){
            board[cr][cc] = '*';
            if(helper(board,cr,cc+1,er,ec,word,idx+1)) return true;
            if(helper(board,cr+1,cc,er,ec,word,idx+1)) return true;
            if(helper(board,cr,cc-1,er,ec,word,idx+1)) return true;
            if(helper(board,cr-1,cc,er,ec,word,idx+1)) return true;

            board[cr][cc] = ch;
        }
        return false;
    }
}
