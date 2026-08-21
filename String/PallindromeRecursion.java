package String;

public class PallindromeRecursion {
    public static void main(String[] args) {
      String str="abba";
      System.out.println(pallindrome(str,0,str.length()-1));  
    }
    static boolean pallindrome(String str , int l , int r){
        if(l>=r) return true;
        if(str.charAt(l)!=str.charAt(r)) return false;
        return pallindrome(str, l+1, r-1);
    }
    
}
