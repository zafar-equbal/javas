// Selection sort works by repeatedly finding the minimum element from the unsorted part of
// the array and placing it at the beginning.
// At every step, the array is divided into two parts:
// ● Left part → already sorted
// ● Right part → unsorted

// Algorithm
// 1. Loop from index 0 to n-2.
// 2. Assume the current index is the minimum.
// 3. Traverse the remaining array to find the actual minimum element.
// 4. Swap the minimum element with the current index.
// 5. Repeat until the array is sorted.

package Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selection (int [] arr ){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={7,4,8,1,9,5};
        selection(arr);
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        System.out.println(Arrays.toString(arr));
    }
    
}
