import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m= arr2.length;

        int[] array=new int[n+m];
        for (int i=0;i<n;i++){
            array[i]=arr1[i];
        }
        for (int i=0;i<m;i++){
            array[n+i]=arr2[i];
        }
        Arrays.sort(array);
        int k=array.length;

        if (k%2==0){
            double median=(array[(k-1)/2]+array[k/2])/2.0;
            return (median);
        }
        else{
            double median=array[k/2];
            return (median);
        }
    }
}
