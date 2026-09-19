// 1. Find the smallest element in an array
package Array;

public class SmallestElementInArray {

    static int smallestElement(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            } 
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr ={5,3,7,9,1};
        int ans =smallestElement(arr);
        System.out.println(ans);
    }
    
}
