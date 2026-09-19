package Array;


//Brute Force 
public class ArrayIsSortedOrNot {

    static boolean isSorted (int  [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
            
        }
        return true;
    }


    // Optimal : O(n)
    static boolean sortedOrNot(int [] arr){
         
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String [] args){
        int [] arr ={1,2,3,4,5,6,67};
        boolean ans=sortedOrNot(arr);
        System.out.println(ans);
    }
}
