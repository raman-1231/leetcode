class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for ( int i=0;i<n;i++){
            sum+=arr[i];
        }
        int leftsum=0;
        for ( int i=0;i<n;i++){
            int rightsum = sum-leftsum-arr[i];
            if( leftsum == rightsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}