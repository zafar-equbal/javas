//6. Rotate array by K elements

/*Right rotate by k: elements move to the right; items falling off the end appear at the start.
e.g. arr=[1,2,3,4,5], k=2 → [4,5,1,2,3]
Left rotate by k: elements move to the left; first elements go to end.
e.g. arr=[1,2,3,4,5], k=2 → [3,4,5,1,2]
Always normalize k: do k = k % n. If k < 0 you can treat it as left rotate (-k) or convert to
equivalent right rotate.
*/

//1) Method A — Temporary array (easy, uses O(k) extra space)
package Array;

import java.util.Arrays;

public class RotateArrayByK {

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};
        int n=7;
        int k=2;
        left_rotate(arr, n, k);
        //rotate_right(arr, n, k);
        // rotateToRight(arr, n, k);
        //lefToRotate(arr, n, k);
        System.out.print(Arrays.toString(arr));
        
    }
    
    //(Righ Rotation => piche se aage aana)

    static void rotateToRight(int[] arr , int n,int k){
        if (n==0) return;
        k=k%n;
        if(k>n){
            return;
        }
        int [] temp =new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }


    //(Left Rotate => Aage se piche aana)

    static void lefToRotate(int [] arr, int n, int k){
        if (n==0) return;
        k=k%n;
        if(k>n) return;
        int [] temp =new int [k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i]=arr[i+k];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-n+k];
        }
    }

    // Method B — Reverse trick (recommended: O(n) time, O(1) space)

    static void reverse(int [] arr,int start ,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }

    static void rotate_right(int [] arr,int n,int k){
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    //(Left Rotation using Method B)

    static void left_rotate(int [] arr , int n , int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
}
