// 1. Find the Largest element in an array

package Array;

public class LargestElementInArray {

    static int largestElement(int [] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
       int [] arr ={10,20,90,40,50};
       
       int ans = largestElement(arr);
       System.out.println(ans); 
    }
    
}
