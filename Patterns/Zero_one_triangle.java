public class Zero_one_triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){//if the sum of row and column no is even there is one otherwise it is zero
                if((i+j)%2==0)    //in the form of matrix
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
/*
n=5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/