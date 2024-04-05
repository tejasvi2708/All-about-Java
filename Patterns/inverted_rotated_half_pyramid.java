public class inverted_rotated_half_pyramid {
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++)//for number of lines
    {
        for(int j=1;j<=n-i;j++ )//for no. of spaces
        {                       //no. of spaces is always less than the input no. by the no. of i value
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)//no. of stars is equal to i-th value.
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
  }
}
/*
 n=4
    *
   **
  ***
 **** 
 */
