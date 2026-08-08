class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                int number = nums[i] + 1;                
                while (number<nums[i+1]){
                    list.add(number);
                    number++;
            }    
            }
            
        }

        return list;
    }
}