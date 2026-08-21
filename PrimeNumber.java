public class PrimeNumber {
    
    public static void main(String[] args) {
        boolean ans =prime(10);
       System.out.println(ans);
    }

    static boolean prime (int n){
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
