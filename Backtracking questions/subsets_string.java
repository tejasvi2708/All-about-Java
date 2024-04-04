public class subsets_string {
    public static void findsubsets(String str,String ans, int i){
   //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
                return;
            }
        }
 //yes choice
        findsubsets(str,ans+str.charAt(i),i+1);
        //no choice
        findsubsets(str,ans,i+1);



    }
    public static void main(String[] args) {
        findsubsets("abc","",0);
        
    }
}
//time complexity O(n*(2^n))
//space complexity O(n)
//  Input : "abc"
/* Output : a, b,c,ab,bc,ac,abc,""
 */