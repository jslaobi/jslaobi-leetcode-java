class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }

        int prev2 = 0;
        int prev1 = 1;
        int result = 0;
        for(int i=2;i<=N;i++){
            result = prev1 +prev2;
            prev2 = prev1;
            prev1 = result;
        }

        return result;
    }
}