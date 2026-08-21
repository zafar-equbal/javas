
import java.lang.Math;
public class MathDSA {
    public static void main(String[] args) {
       int ans=counter2(10036328); 
       System.out.println(ans); 
    }

    static int counter(int N){
        int count=0;
        while(N>0){
           
            count=count+1;
            N=N/10;
        }

        return count;
    }

    static int counter2(int n){
        if(n==0){
            return 1;
        }
        int count=(int)(Math.log10(Math.abs(n))+1);

        return count;
    }
}
