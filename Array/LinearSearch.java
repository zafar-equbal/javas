package Array;

public class LinearSearch {
    public static void main(String[] args) {
      int [] arr ={6,5,4,3,2,1};
      int target=2;
      int ans=linear_search(arr,target);
      System.out.println(ans);  
    }

    static int linear_search(int [] arr,int target){
       int n=arr.length;
       for(int i=0;i<n;i++){
        if(arr[i]==target){
            return i;
        }
       }
       return -1;
        }
    }


