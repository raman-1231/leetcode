class Solution {
    public int firstUniqChar(String s) {
       HashMap <Character,Integer> map = new HashMap<>();

       //char st[] = new char[s.length()];

       for (char ch: s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for (int i = 0; i<s.length();i++){
        if (map.getOrDefault(s.charAt(i),0)==1){
            return i;
        }
       }

       return -1;
    }
}