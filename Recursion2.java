public class Recursion2 {

    public static void main(String[] args) {
        //name(1,5);
       int n =5;
        linearNto1(n,n);
    }

    static void name (int i , int n){
        if(n==i) return;
        System.out.println("Zafar");
        name(i+1,n);
    }

    static void linear1toN(int i ,int n){
        if(i>n) return;
        System.out.println(i);
        linear1toN(i+1, n);
    }
    
    static void linearNto1(int i ,int n){
        if(i<1) return;
        System.out.println(i);
        linearNto1(i-1, n);
    }
}
