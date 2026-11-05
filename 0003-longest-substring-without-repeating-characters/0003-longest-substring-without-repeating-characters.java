class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l = 0;
        char [] arr = s.toCharArray();
        int max=0;
        HashSet <Character> set = new HashSet<>();

        for (int i =0; i<arr.length; i++){
            
            while (set.contains(arr[i])){
                set.remove(arr[l]);
                l++;
            }
            set.add(arr[i]);
            max = Math.max(max,i-l+1);
            
        }
        return max;
    }
}