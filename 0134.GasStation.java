class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int start = 0;
        for(int i=0;i<gas.length;i++){
            totalGas = totalGas - cost[i] + gas[i];
        }

        if(totalGas < 0){
            return -1;
        }

        for(int i=0;i<gas.length;i++){
            currentGas = currentGas - cost[i] + gas[i];
            if(currentGas < 0){
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;
    }
}