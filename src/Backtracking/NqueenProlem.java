package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NqueenProlem {

     //get the values
    public static boolean isSafe(int row,int col,int n,char[][]grid){
        int tempCol , tempRow;

        // for col search is safe
       tempCol = col;
       while(tempCol>=0){
           if(grid[row][tempCol]=='Q')
               return false;
           tempCol--;
       }

       // check for upper diagonal
        tempCol= col ;
        tempRow= row;
       while(tempCol>=0 && tempRow>=0){
           if(grid[tempRow][tempCol]=='Q')
               return false;
           tempCol--; tempRow--;
       }

       tempCol = col;
       tempRow = row;
       while(tempCol>=0 && tempRow<n){
            if(grid[tempRow][tempCol]=='Q')
                return false;
            tempCol--; tempRow++;
        }

       return true;
    }

    public static void Generate(char[][]grid,int col, int n){
        if(col==n){
            System.out.println(Arrays.deepToString(grid));
//          System.out.println(Arrays.deepToString(grid));
            return ;
        }

        for(int row = 0; row <n;row++){
            if(isSafe(row,col,n,grid)){
                grid[row][col] = 'Q';
                Generate(grid,col+1,n);
                grid[row][col] = '.';
            }
        }


    }




    public static void main(String[] args) {
        int n = 4;

        // Creating a 2d array
        char[][]grid = new char[n][n];

        // set all the places with .
        for(char[]m:grid){
            Arrays.fill(m,'.');
        }

        Generate(grid,0,n);

    }

}
