package Array;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {
    
    // 1. Brute Force Approach
    
    
    static ArrayList<Integer> BruteMultiplicity(int [] arr1, int n1 , int [] arr2, int n2){
        ArrayList<Integer> res = new ArrayList<>();
        int [] visited =new int[n2];

        for(int i =0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(visited[j]==0 && arr1[i]==arr2[j]){
                    res.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]) break;
            }
        }
        return res;

    } 

    // Unique Intersection deduplicated 

static ArrayList<Integer> array_intersection(int [] arr1 , int n1 , int [] arr2 , int n2 ){
    ArrayList<Integer> res= new ArrayList<>();
    int [] visited = new int[n2];

    for(int i =0 ; i<n1;i++){
        if(i>0 && arr1[i]==arr1[i-1]) continue;

        for(int j=0;j<n2;j++){
            if(visited[j]==0 && arr1[i]==arr2[j]){
                res.add(arr1[i]);
                break;
            }
            if(arr2[j]>arr1[i]) break;
        }
    }
    return res;
}



//   2. Two Pointer Approach O(n1+n2)
// A. Unique Intersection

static ArrayList<Integer> intersectionTwoPointerUnique(int [] a ,int n1, int [] b, int n2){
    int i=0;
    int j=0;
    ArrayList<Integer> res =new ArrayList<>(Math.min(n1,n2));

    while(i<n1 && j<n2){
        if(a[i]==b[j]){
            if(res.isEmpty() || !res.get(res.size() -1 ).equals(a[i])){
                res.add(a[i]);
            }
                int val=a[i];
                while (i<n1 && a[i]== val) {
                    i++;
                }
                while (j<n2 && b[j]==val) {
                    j++;
                }
            }
            else if(a[i]<b[j]){
                    i++;

                }else{
                    j++;
                }
            }
        
            return res;   
} 


     static ArrayList<Integer> intersectionTwoPointerMultiplicity(int [] a, int n1 , int [] b , int n2){
        int i=0;
        int j=0;
        ArrayList<Integer> res= new ArrayList<>(Math.min(n1,n2));
        while (i<n1 && j<n2) {
            if(a[i]==b[j]){
                res.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return res;
     }


     public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 5, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> result =
                intersectionTwoPointerMultiplicity(arr1, n1, arr2, n2);

        System.out.println("Intersection: " + result);
    }
}
