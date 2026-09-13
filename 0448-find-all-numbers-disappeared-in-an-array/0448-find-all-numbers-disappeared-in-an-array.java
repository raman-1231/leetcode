class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        // Arrays.sort(arr);
        // int i = 0;
        // for(int j=0;j<arr.length;j++){
        //     if (arr[i]!=arr[j]){
        //         i++;
        //         arr[i]=arr[j];
        //     }
        // }

        // int a=0;
        List <Integer> list = new ArrayList<>();
        // for (int k=1;k<arr.length;k++){
        //     if (i>a|| arr[a]!=k){

        //         list.add(i);

        //     } else{
        //         a++;
        //     }
        // }
        HashSet <Integer> set = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            if(!set.contains(i+1)){
                list.add(i+1);
                
            }
        }
        return list;
    }
}