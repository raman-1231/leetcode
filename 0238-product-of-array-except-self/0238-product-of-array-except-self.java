class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr = new int [nums.length];
        int prod = 1;

        for (int i=0;i<nums.length;i++){
            arr[i]= prod;
            prod*=nums[i];
        }
        prod = 1;
        
        for (int i=nums.length-1;i>=0;i--){
            arr[i]*= prod;
            prod*=nums[i];
        }
        return arr;
    }
}


















//        int n= nums.length;
        // int [] arr = new int[n];
        // int product = 1;
        // for (int i = 0; i<n;i++){
        //     arr[i]=product;
        //     product*=nums[i];
        // }
        // product = 1;
        // for (int i = n-1; i>=0;i--){
        //     arr[i]*=product;
        //     product*=nums[i];
        // }
//         // return arr;
//     }
// }