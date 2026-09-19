import java.util.Arrays;

public class RecursiveInsertion{

    public static void recursiveInsertion(int[] arr , int n){
        if(n<=1) return;

        recursiveInsertion(arr, n-1);

        int last=arr[n-1];
        int j=n-2;

        while(j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    }

    public static void main(String[] args){
        int [] arr={6,2,8,5,1,9,0};
        recursiveInsertion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}