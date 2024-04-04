public class grid_ways {
    public static int gridways(int i, int j,int n, int m){
        //base case
        if(i==n-1 && j==m-1)//lastcell
        {
         return 1;
        }
         else if(i==n || j==m){//boundary condition
            return 0;
         }
         //no left and up movments are allowed.
         int w1=gridways(i+1,j,n,m);//right step
         int w2=gridways(i,j+1,n,m);//down step 
         return w1+w2;//total steps we can reach to the target 
        }
        public static void main(String[] args) {
            int n=3,m=3;
            System.out.println(gridways(0,0,n,m));
        }
            
        }
    

