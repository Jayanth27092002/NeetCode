class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row=new int[9][9];
        int[][] col=new int[9][9];
        int[][] grid=new int[9][9];


        for (int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char value=board[i][j];
                if(value!='.'){
                    int intValue=value-'0';
                    int gridIndex=(i/3)*3 + j/3;
                    if(row[i][intValue-1]!=0)return false;
                    if(col[intValue-1][j]!=0) return false;
                    if(grid[gridIndex][intValue-1]!=0) return false;

                    

                    //how to know grid number

                    row[i][intValue-1]+=1;
                    col[intValue-1][j]+=1;
                    grid[gridIndex][intValue-1]+=1;



                }
            }
        }

        return true;
        
    }
}
