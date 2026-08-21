import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int n=sc.nextInt();
       

        System.out.println("Enter a decimal number :");
        float f=sc.nextFloat();

         System.out.println("Enter a word :");
         String w=sc.next();
        

        System.out.println(n);

        System.out.println(f);

        System.out.println(w);


       sc.close();
       
    }
}