package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static void generatePossible(int[]num, int n, List<Integer> subset, int target){
        if(target==0){
            System.out.println(subset);
            return;
        }

        if(n==num.length){
            return;
        }


        generatePossible(num,n+1,subset,target);

        subset.add(num[n]);
        generatePossible(num, n+1,subset,target-num[n]);
        subset.remove(subset.size()-1);
    }
    public static void main(String[] args) {
        int[]num = {2,3,5};
        int target = 5;
        generatePossible(num,0,new ArrayList<>(), target);
    }
}
