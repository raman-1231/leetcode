class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double ms=Integer.MIN_VALUE;

        int sum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        ms=sum;
        for (int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ms= Math.max(ms,sum);

        }
        return ms/k;

    }
}
