class Solution {
    public int findMaxLength(int[] arr) {
        HashMap <Integer,Integer> map = new HashMap<>();

        map.put(0,-1);
        int sum=0;
        int maxlength=0;


        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                sum--;
            }
            else{
                sum++;
            }

            if (map.containsKey(sum)){
                int length = i-map.get(sum);
                maxlength= Math.max(length,maxlength);
            } else{
                map.put(sum,i);
            }
        }
        return maxlength;
    }
}