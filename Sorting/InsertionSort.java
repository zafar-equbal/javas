// Insertion sort builds the sorted array one element at a time, similar to how we sort playing
// cards in our hand.
// The current element is inserted into its correct position in the already sorted part.

// Algorithm
// 1. Start from the second element.
// 2. Compare it with elements before it.
// 3. Shift larger elements one position to the right.
// 4. Insert the current element at the correct position.
// 5. Repeat for all elements.


package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int [] arr ={9,8,7,6,5,4,3,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr)); 
    }
    
}
