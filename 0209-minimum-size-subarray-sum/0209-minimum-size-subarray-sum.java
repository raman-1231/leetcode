class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for ( int i = 0;i<n;i++){
            sum += nums[i];
            while (target<=sum){
                ans = Math.min(ans,i-left+1);
                sum-=nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
        
    }
}