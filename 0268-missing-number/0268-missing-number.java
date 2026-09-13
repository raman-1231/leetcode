class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        // for ( int i =0;i<nums.length;i++){
        //     if (nums[i]!=i){
        //         return i;
        //     }
        //     if (nums[n-1]!=n){
        //         return n;
        //     }

        // }
        // return -1;

        // another way

        int sum1= n*(n+1)/2;
        int sum2 = 0;
        for(int i = 0;i<n;i++){
            sum2+=nums[i];
        }
        if(sum1==sum2){
            return 0;
        }
        return sum1-sum2;
    }
}