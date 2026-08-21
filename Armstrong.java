public class Armstrong {

    public static void main(String[] args) {
      System.out.println( checkArmstrong(153));
      
    }

    static boolean checkArmstrong(int n){
        int original=n;
        int digits=(int) Math.log10(n)+1;
        int sum=0;
        while(n!=0){
            int d = n%10;
            sum+=(int) Math.pow(d,digits);
            n/=10;

        }
        return sum==original;
    }
    
}
