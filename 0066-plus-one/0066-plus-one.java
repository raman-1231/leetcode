import java.util.*;
class Solution {
    public int[] plusOne(int[] arr) {
        int i=0;
        int n=arr.length;
        for (i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }

        int [] result = new int[n+1];
        result[0] = 1;
        
        return result;
    }
}