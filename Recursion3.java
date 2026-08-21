public class Recursion3 {

// sum of n Numbers;
    static int sum (int n){
        if(n==0) return 0;

        return n+sum(n-1);

    }


    // Factorial of a Number;

    static int factorial (int n){
        if (n==0) return 1;

        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n= 4;
        int ans=factorial(n);
        System.out.println(ans);
    }
    
}
