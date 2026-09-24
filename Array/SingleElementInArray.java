// Find the number that appears once, and the other numbers twice

package Array;

import java.util.HashMap;

public class SingleElementInArray {

    //Approach 1: Brute Force (Double Loop)


    static int getSingleElement (int [] arr){
        int n=arr.length;

        for(int i =0;i<n;i++){
            int num=arr[i];
            int cnt=0;

            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    cnt++;
                }
                if(cnt==1) return num;
            }
           
        }
         return -1;

    }

    // Approach 2: Hashing / Frequency Array

    static int getSingleElementOptimal(int [] arr){
        int n= arr.length;

        int maxi =arr[0];
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int [] hash =new int[maxi +1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[arr[i]]==1) return arr[i];
        }
        return -1;
    }

    // Approach 4: XOR Trick (Optimal)

    static int getSingleElementXOR(int [] arr ){
        int n = arr.length;

        int xorr=0;
        for(int i=0;i<n;i++){
            xorr=xorr^arr[i];
        }
        return xorr;
    }


    public static void main(String[] args) {
        int [] arr ={5,1,2,1,2};
        int ans =getSingleElementXOR(arr);
        System.out.println(ans);
    }
    

}
