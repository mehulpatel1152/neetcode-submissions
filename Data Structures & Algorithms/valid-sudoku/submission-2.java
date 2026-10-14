class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int row[][] = new int[10][10];
        int col[][] = new int[10][10];

        

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                int block[] = new int[10];

                for(int c=i;c<i+3;c++){
                    for(int r=j;r<j+3;r++){
                        if(board[r][c]=='.')continue;

                        if(row[r][Integer.parseInt(board[r][c]+"")]==1)return false;
                        else row[r][Integer.parseInt(board[r][c]+"")]=1;

                        if(col[c][Integer.parseInt(board[r][c]+"")]==1)return false;
                        else col[c][Integer.parseInt(board[r][c]+"")]=1;

                        if(block[Integer.parseInt(board[r][c]+"")]==1)return false;
                        else block[Integer.parseInt(board[r][c]+"")]=1;
                    }
                }

            }

        }

        return true;

    }
}
