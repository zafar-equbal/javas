//2. Find Second Smallest and Second Largest Element in an array (Two-Pass Approach)

package Array;

public class SecondLargest {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,90,100};
        int n=arr.length;
        getElement(arr, n);
        
    }

    static void getElement(int[] arr , int n){
        if(n==0||n==1) {
            System.out.println(-1);
        }

        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            small=Math.min(small, arr[i]);
            large=Math.max(large,arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
            if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
           
        }
         System.out.println("Second small is :"+second_small);
         System.out.println("Second Large is :"+second_large);
    } 
    
    

    // Optimal (Single Pass)

    static int secondSmallestt(int [] arr , int n){
        if(n<2) return -1;

        int small=Integer.MAX_VALUE;
        int second_samll=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<small){
                second_small=small;
                small=arr[i];
            }
            else if (arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];

            }
        }
        return second_small;
    }
    
}
