public class Count {
    public static void main(String[] args) {
       int ans =countDigits(3456789);
       System.out.println(ans); 
    }

    public static int countDigits(int n){
        if(n==0){
            return 1;
        }
        int count =0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}
