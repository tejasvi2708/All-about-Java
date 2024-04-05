import java.util.*;

class pattern3{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
      
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n/2;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-(2*i);j++) 
             { 
                System.out.print("@");
             }
             System.out.println();
     }
}
}