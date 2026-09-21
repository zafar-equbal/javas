package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class UnionOfTwoSortedArray {
   
// Approach A — map / set (easy, uses tree)

    static ArrayList<Integer> findUnion(int [] arr1, int [] arr2){
        int n =arr1.length;
        int m=arr2.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        ArrayList<Integer> union=new ArrayList<>();

        for(int i=0;i<n;i++){
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
        }

        for(int i=0;i<m;i++){
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
        }
        for(int key : freq.keySet()){
            union.add(key);
        }
        return union;

    }

// Approach (BEST when inputs are sorted) — Two-pointer merge
   static ArrayList<Integer> unionOfArray(int [] arr1, int [] arr2){
    int n=arr1.length;
    int m=arr2.length;
    int i=0;
    int j=0;

    ArrayList<Integer> union=new ArrayList<>();

    while(i<n && j<m){
        if(arr1[i]<=arr2[j]){
            if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }else{
            if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
    }
    while (i<n) {
        if(union.size() ==0 || union.get(union.size()-1)!=arr1[i]){
            union.add(arr1[i]);
        }
        i++; 
    }

     while (j<m) {
        if(union.size() ==0 || union.get(union.size()-1)!=arr2[j]){
            union.add(arr2[j]);
        }
        j++; 
    }
    return union;

   }
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> union = findUnion(arr1,arr2);

        System.out.println("Union of arr1 and arr2:");

        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}




//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

//         ArrayList<Integer> union = findUnion(arr1, arr2);

//         System.out.print("Union of arr1 and arr2 is: ");

//         for (int val : union) {
//             System.out.print(val + " ");
//         }
//     }
    
// }
