public class NToOne {

    public static void main(String[] args) {
      int n=10;
      oneToN(n);  
    }

    static void nToOne(int n){
        if(n==0) return;
        System.out.println(n);
        nToOne(n-1);
    }

    // 1  to N

    static void oneToN(int  n){
        if(n==0) return;
        oneToN(n-1);
        System.out.println(n);
    }
}