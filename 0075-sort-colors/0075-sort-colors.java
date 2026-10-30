class Solution {
    public void sortColors(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();

        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int index = 0;

        for (int i=0; i<3; i++){
            for (int j=0; j<map.get(i); j++){
                nums[index++]=i;
            }   
        }

    }
}