public class ReverseArray {
    public static void main(String[] args) {
     int [] arr ={10,20,30,40,50};
     //int r =arr.length-1;
    arrayReverse(arr, 0, arr.length-1);  
    
    // Print the reversed array
        for (int i : arr) {
            System.out.print(i + " ");
    }
}

    static void arrayReverse(int [] arr , int l ,int r){
        if(l>=r) return;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

         arrayReverse(arr, l+1, r-1);;
        }
    
}
