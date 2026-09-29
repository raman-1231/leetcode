class Solution {
    public int longestOnes(int[] arr, int k) {
        int count0=0;
        int left =0;
        int maxLength=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count0++;
            }
            while (count0>k){
                if (arr[left]==0){
                    count0--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,i-left+1);
        }
        
        return maxLength;
    }
}