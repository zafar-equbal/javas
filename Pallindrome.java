public class Pallindrome {

    public static void main(String[] args) {
     System.out.println(checkPallindrome(1211));   
    }

    static boolean checkPallindrome(int n){
      int original =n;
      int rev =0;
      
      while(n!=0){
        rev = rev*10+(n%10);
        n/=10;
      }

      return rev==original;
    }
    
}
