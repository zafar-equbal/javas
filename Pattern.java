public class Pattern{
    
    static void pattern1(int n){
        for(int i=0; i<n ;i++){
            for(int j=0 ;j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


       static void pattern2(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       }

       static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print(j+" ");
                
            }
             System.out.println();
        }
       }

       static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
       }

       static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       }

       static void pattern7(int n){
        for(int i=0;i<n;i++){

            //space 
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
            }
            
        }

        static void pattern18(int n){
            for(int i=0;i<n;i++){
                for(char ch=(char)('E'- i);ch<='E';ch++){
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }
 


        static void pattern19(int n){
            int iniS=0;
            for(int i=0;i<n;i++){
                //star
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                //space
                for(int j=0;j<iniS;j++){
                    System.out.print(" ");
                }
                //star
                 for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                iniS +=2;
                System.out.println();
            }
        }

        public static void main(String [] args){
        int n=10;
        pattern19(n);

    }

        
       }
       