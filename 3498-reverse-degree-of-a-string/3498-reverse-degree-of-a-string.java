class Solution {
    public int reverseDegree(String s) {

        int value =0;
        int out=0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            value = 'z'-c+1;

            out+=(value*(i+1));
        }
        return out;
    }
}