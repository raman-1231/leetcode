class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char [] a = s.toCharArray();
        int l=0;
        HashSet <Character> set = new HashSet<>();
        for (int i=0; i<a.length;i++){
            while(set.contains(a[i])){
                set.remove(a[l]);
                l++;
            }
            set.add(a[i]);
            max = Math.max(max,i-l+1);
        
        }
        return max; 
    }
}