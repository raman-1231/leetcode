class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        
        List<List<Integer>> list = new ArrayList<>();

        for ( int i=2;i<=n/2;i++){
            if (isPrime(i) && isPrime(n-i)){

                list.add(Arrays.asList(i,n-i));
            }
        }
        return list;
    }
    public boolean isPrime(int n){
        if (n<=1) return false;
        int count=0;
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
            
        }

        return true;
    }
}