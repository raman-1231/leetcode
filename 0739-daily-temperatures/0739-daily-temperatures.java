class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        Stack <Integer> stack = new Stack<>();

        int [] arr1= new int[n];
 

        for (int i = 0;i<n;i++){

            while ( !stack.isEmpty()&& arr[i]>arr[stack.peek()]){
                int index = stack.pop();
                arr1[index]= i - index;

                index++;
            }
            stack.push(i);
        }
        return arr1;
    }
}