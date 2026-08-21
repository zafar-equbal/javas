public class Reverse {

    public static void main(String[] args) {
        int ans=reverse(5674);
        System.out.println(ans);
    }

    public static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev= rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    
}
