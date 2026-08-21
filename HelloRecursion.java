public class HelloRecursion {
    public static void main(String[] args) {
     hello(5);  
    }

    static void hello(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello Recursion to Zafar");
        hello(n-1);
    }
    
}
