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

    public static void getsubset(int[]num, int n, int xor , List<Integer > subset){

        if(n==num.length){
            System.out.println(xor);
            return;
        }

        subset.add(num[0]);
        getsubset(num, n+1, xor^num[n], subset);
        subset.remove(subset.size()-1);
        getsubset(num, n+1, xor, subset);
        

    }

    public static void main(String[] args) {
        int[]num = {2,3,5};
        int target = 5;
        generatePossible(num,0,new ArrayList<>(), target);
        getsubset(num, 0, 0,new ArrayList<>());

    }
}
