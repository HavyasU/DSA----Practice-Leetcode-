class Solution {
    public boolean isValidSudoku(char[][] board) {

        int n = 9;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.clear();
            for(int j=0;j<n;j++){
                if(board[i][j]!='.' && !set.add(board[i][j]-'0')){
                    System.out.println("Faileed at 1"+i+" "+j);
                    return false;
                }
            }
        }
        for(int i=0;i<n;i++){
            set.clear();
            for(int j=0;j<n;j++){
                if(board[j][i]!='.' && !set.add(board[j][i]-'0')){
                    System.out.println("Faileed at 1");
                    return false;
                }
            }
        }
        

        // for(int i=0;i<n;i++){
        //     set.clear();
        //     for(int j=0;i<n;j++){
        //         if(!set.add(board[j][i]-'0')){
        //             return false;
        //         }
        //     }
        // }

        for(int row=0;row<n;row+=3){
            for(int col=0;col<n;col+=3){
                set.clear();
                for(int i =row; i<row+3; i++){
                    for(int j=col;j<col+3;j++){
                    if(board[i][j]!='.' && !set.add(board[i][j]-'0')){
                        return false;
                    }
                    }
                }
            }
        }

        return true;

    }
}