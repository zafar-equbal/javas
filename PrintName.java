public class PrintName {

    public static void main(String[] args) {
     int n=5;
     name(n);   
    }

    static void name(int n){
        if(n==0) return;

        System.out.println("Hello Zafar");

        name(n-1);
    }
    
}
