class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for(int i=0; i<A.length; i+=2){
            if(A[i] % 2 ==1) {
                while(A[j] % 2 == 1 && j<A.length){
                    j+=2;
                }
                
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        return A;
    }
}