package Backtracking;

import java.util.Arrays;

public class KnightTour {

      // note the rows and col
     static int[]rowNext = {-2,-2,2,2,-1,1,-1,1};
     static int[]colNext ={-1,1,-1,1,-2,-2,2,2};

     public static boolean isPossible(int row , int col, int n, int[][]matrix){
         if(row >=0 && row < n && col>=0 && col <n && matrix[row][col]==-1){
             return true;
         }
         return false;
     }

     public static boolean knightTour(int row,int col, int n , int[][]mat,int move){
         if(move == n*n){
             return true;
         }

         for(int i= 0; i < rowNext.length;i++){
             int rowValue = row + rowNext[i];
             int colValue =  col + colNext[i];

             if(isPossible(rowValue,colValue,n,mat)){
                 mat[rowValue][colValue] = move;
                 if(knightTour(rowValue,colValue,n,mat,move+1)){
                     return true;
                 }else {
                     mat[rowValue][colValue] = -1;
                 }
             }
         }
         return false;
     }


    public static void main(String[] args) {
        int n= 5;
        int [][] mat = new int[n][n];

        // Set all values to be -1
        for(int[] c : mat ){
            Arrays.fill(c,-1);
        }

        // setinitial val to  0
        mat[0][0] = 0;

        boolean getValues = knightTour(0,0,n,mat,1);

        if(getValues){
            for(int[]val: mat) {
                for (int x : val) {
                    System.out.print(x + " ");
                 }
                System.out.println();
            }
        }
        else  {
            System.out.println("No possible solution exit tata ");
        }
    }
}
