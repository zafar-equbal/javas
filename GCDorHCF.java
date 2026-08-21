public class GCDorHCF {

    public static void main(String[] args) {
      int ans=gcd(2, 4);
      System.out.println(ans);
    }

    static int gcd(int a,int b){
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        return a;

    }
}