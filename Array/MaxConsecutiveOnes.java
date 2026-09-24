// 11. Count Maximum Consecutive One's in the array


package Array;

public class MaxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int [] nums){
        int count=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;

    }

    public static void main(String[] args) {
        int [] nums={1,2,1,1,9,8,1,1,1,1,1,1,1,1};
        int ans=findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}
