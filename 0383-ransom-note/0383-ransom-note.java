class Solution {
    public boolean canConstruct(String ran, String mag) {
        if (ran.length()>mag.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();


        for (char ch : mag.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for ( int i=0;i<ran.length();i++){
            char ch = ran.charAt(i);
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}