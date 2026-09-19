// Quick Sort is a divide and conquer sorting algorithm.
// It works by selecting a pivot element, placing it at its correct position, and then recursively
// sorting the elements on the left and right of the pivot.
// Unlike merge sort, quick sort sorts the array in-place.


// Question Explanation
// You are given an array of integers.
// Your task is to sort the array using the Quick Sort algorithm.
// The idea is:
//  Pick one element as a pivot.
//  Rearrange the array so that:
//  All elements smaller than the pivot are on the left.
//  All elements greater than the pivot are on the right.
//  Recursively apply the same steps to the left and right subarrays.

// Algorithm :
// 1. Choose the last element of the array as the pivot.
// 2. Rearrange the array such that:
// ○ Elements smaller than or equal to pivot come before it.
// ○ Elements greater than pivot come after it.
// 3. The pivot is now at its correct position.
// 4. Recursively apply quick sort on:
// ○ Left subarray (elements before pivot)
// ○ Right subarray (elements after pivot)
// 5. Repeat until subarray size becomes 0 or 1.



import java.util.Arrays;

public class QuickSort {


    static int partition(int [] arr , int low , int high){
        int pivot=arr[high];
        int i =low-1;


        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    static void quickSort(int [] arr , int low , int high){
        if(low<high){
            int pi=partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }


    public static void main(String []args){
        int [] arr = {10,7,8,9,1,5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}




/*Complexity Analysis
 Time Complexity:
 Best Case: O(n log n) (balanced partitions)
 Average Case: O(n log n)
 Worst Case: O(n²) (already sorted array with bad pivot choice)
 Worst case happens because the pivot always ends up at one extreme, leading to highly
unbalanced partitions.
 Space Complexity: O(log n)
Due to recursion stack in the average case.*/