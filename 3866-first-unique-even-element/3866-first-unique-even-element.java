class Solution {
    public int firstUniqueEven(int[] nums) {

        HashMap <Integer,Integer> map = new HashMap<>();

        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if (nums[i]%2==0 && map.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}

        
        // int left = 0;
        // for (int i=0;i<nums.length;i++){
        //     if (nums.length==1 && nums[i]%2==0) return nums[i];

        // }
        
        // for (int i=0;i<nums.length-1;i++){
        //     if(nums[left]!=nums[i]){
        //         if(nums[i]!=nums[i+1] && nums[i]%2==0){
        //             return nums[i];
        //         }
        //         left++;
        //     }
        // }
//         return -1;
//     }
// }