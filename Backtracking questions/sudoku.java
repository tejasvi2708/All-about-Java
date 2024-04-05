public class sudoku {
    //9x9 grid
    public static boolean isSafe(int sudo[][],int row,int col,int digit){
        for(int i=0;i<=8;i++){
            if(sudo[i][col]==digit){//checking each column in singe row
                return false;//if digit is already present then return false
                
            }
        }
        for(int j=0;j<9;j++){
           if( sudo[row][j]==digit){//checking each row 
            return false;
           }
        }
        //3x3 grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudo[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudoku_solver(int sudo[][],int row,int col){
        //base  case
        if (row==9){//checking if last row ends then end the function
return true;
        }
        int nextRow=row,nextCol=col+1;
        if(col+1==9){//if col ends then change row no. and nitialize col again wth 0
nextRow=row+1;//initializing
nextCol=0;
        }
        if(sudo[row][col]!=0){//calling to enter the digit
            return sudoku_solver(sudo,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
         if(isSafe(sudo,row,col,digit)){//after checking all conditions, calling isSafe() and enetring the digitd
            sudo[row][col]=digit;
         
         if(sudoku_solver(sudo,nextRow,nextCol)){
            return true;//if solution exists
         }
         sudo[row][col]=0;
        }
        }
    return false;//if solution do not exists
    }
    public static void printsudoku(int sudo[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudo[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       int sudo[][]={{0,0,8,0,0,0,0,0,0},
                      {4,9,0,1,5,7,0,0,2},
                     {0,0,3,0,0,4,1,9,0},
                    {1,8,5,0,6,0,0,2,0},
                   {0,0,0,0,2,0,0,6,0},
                  {9,6,0,4,0,5,3,0,0},
                 {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};
                if(sudoku_solver(sudo,0,0)){
                System.out.println("solution exists");
                printsudoku(sudo);
        
    }
    else{
        System.out.println("solution do not exists");
    }
}
}