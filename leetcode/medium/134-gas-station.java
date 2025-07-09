class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int totalTank = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++){
            int gain = gas [i] - cost [i];
            tank += gain;
            totalTank += gain;

            if (tank < 0){
                startIndex = i + 1;
                tank = 0;
            }
        }
        return totalTank >= 0 ? startIndex : -1;
    }
}
