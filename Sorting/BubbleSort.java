// Bubble sort repeatedly compares adjacent elements and swaps them if they are in the wrong
// order.
// After each pass, the largest element moves to the end, like a bubble rising up.

// Algorithm
// 1. Repeat passes over the array.
// 2. Compare adjacent elements.
// 3. Swap if left element is greater than right.
// 4. After each pass, the largest element settles at the end.
// 5. Stop early if no swaps occur in a pass.


package Sorting;

import java.util.Arrays;

public class BubbleSort {
    
    static void bubbleSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
        int [] arr={5,2,7,4,9,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
