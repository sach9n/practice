package Queues;

public class GasStation {
    // Asked in lot /of companies
    //Gas station g1 ,g2,g3 , g4 and g5
    // Analaysis Cost will remain of be a profitable road fot this

    //optimized approach of O(N) and space O(1)

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n= gas.length;
        int startIndex = 0;
        int currGain =0;
        int TotalGain=0;

        for(int i = 0; i< n;i++){
            TotalGain += (gas[i] - cost[i]);
            currGain += (gas[i] - cost[i]);

            if(currGain < 0){
                startIndex = i+1;
                currGain = 0;
            }
        }

        if(TotalGain>=0){
            return startIndex;
        }

        return -1;
    }

}
