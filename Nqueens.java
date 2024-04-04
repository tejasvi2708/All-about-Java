public class Nqueens {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up in the board statrting from the end
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
         //diagonal left up in the board statrting from the end
      for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
        //diagonal left up in the board statrting from the end
        for(int i=row-1 ,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
        }
      
      return true;
    }
public static void nQueens(char board[][],int row){
    //base case
    if(row==board.length){
        printBoard(board);
        return;
    }
    //column loop
    for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){//if queen is safe to place 
            board[row][j]='Q';
            nQueens(board,row+1);//function call
            board[row][j]='X';//backtracking step
        }
    }
}
public static void printBoard(char board[][]){
    System.out.println("--------chess board--------");

    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    int n=5;
    
    char board[][]=new char[n][n];
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            board[i][j]='x';
        }
    }
    nQueens(board,0);
}
    }

