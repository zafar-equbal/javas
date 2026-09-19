// 4. Remove Duplicates in-place from Sorted Array

package Array;


import java.util.HashSet;

public class RemoveDuplicates {

// Return number of unique Elements


    public static  int remove_duplicate(int [] nums){
        HashSet<Integer> seen = new HashSet<>();
        int index =0;

        for(int num :  nums){
             if(!seen.contains(num)){
                seen.add(num);
                nums[index]=num;
                index++;
             }
        }
         return index;
    }


// Optimal : Two Pointer Approach => Return the number of unique elements

  static int removeDuplicates(int [] nums){
    if(nums==null || nums.length==0) return 0;
    int i=0;
    for(int j=1;j<nums.length;j++){
        if(nums[j]!=nums[i]){
            i++;
            nums[i]=nums[j];
        }
    }
    return i+1;
  }

    public static void main (String [] args){
        int [] nums ={ 1,2,3,3,4,7};
        System.out.println(removeDuplicates(nums));
    }
}
