package Array;

import java.util.Arrays;

public class MoveAllZeroToEnd {

    public static void main(String[] args) {
        int [] arr ={1,0,3,0,9,0,7,4,0,5,3};
        move_zero_to_end(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    //Approach 1: Using extra Array ,Brute Force

    static int[] moveZero(int [] arr){
        int [] temp=new int[arr.length];
        int index=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        return arr;
    }


    //Optimal Approach Two Pointer/Swapping

    static void move_zero_to_end(int [] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
