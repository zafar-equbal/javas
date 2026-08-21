public class Recursion1 {
    public static void main(String[] args) {
      printf();  
    }
      static int count =0;
    public static void printf(){
       if(count==0)  return;
      
         System.out.println(count);
         count++;
         printf();
          
      }
    }
    

