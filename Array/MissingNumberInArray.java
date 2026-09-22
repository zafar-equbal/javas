package Array;

public class MissingNumberInArray {
    
    // Brute Force 

    static int missingNumberBrute(int [] arr , int n){
        for(int i=1;i<n;i++){
            int flag=0;

            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag =1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }


    // Approach 2 : Hashing/ Freq Array
    static int missingNumberUsingHash(int [] arr , int n){
        int[] hash=new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
          for(int i=0;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }


    // Approach 3 : Sum Formula (Watch overflow)

    static int missingNumberSum(int [] arr , int n){
        int sum=(n*(n+1))/2;

        int s2=0;
        for(int i =0;i<n-1;i++){
            s2+=arr[i];

        }
        int missingNum=sum -s2;
        return missingNum;
    }

    // XOR Approach

    static int missingNumberXOR(int [] arr , int n ){
        int xor1=0;
        int xor2=0;

        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return (xor1^xor2);
    }

    public static void main(String[] args) {
        int []arr={1,3};
        int n=arr.length;
        int ans =missingNumberXOR(arr, n);
        System.out.println(ans);
    }
}
