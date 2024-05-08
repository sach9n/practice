package Backtracking;

public class RatInMaze {

    static int []rowInc = {-1,1,0,0};
    static int []colInc = {0,0,-1,1};
    static char[]direction = {'U','D','L','R'};

    public static boolean isSafe(int row , int col , int[][]matrix, boolean[][]vis, int n){
        if(row >= 0 && row < n && col >= 0 && col< n && matrix[row][col]==1 && !vis[row][col]){
            return true;
        }
      return  false;
    }

    public static void traverseRatInMaze(int row, int col, int n, int[][]matrix,boolean[][] visited, String path){
        if(row ==n-1 && col == n-1 ){
            System.out.println(path);
            return;
        }

        for(int i =0; i< rowInc.length; i++){
            int rowNext = row + rowInc[i];
            int colNext = col + colInc[i];
            char dest = direction[i];

            if(isSafe(rowNext, colNext, matrix,visited,n)){
                visited[rowNext][colNext] = true;
                traverseRatInMaze(rowNext,colNext,n,matrix,visited,path+dest);
                visited[rowNext][colNext] = false;
            }
        }

    }

    public static void main(String[] args) {
        int N = 4;
        int[][]matrix = {{1,1,0,0}, {1,1,0,0}, {0,1,1,0}, {0,1,1,1}};

        if(matrix[0][0]==0){
            System.out.println("Not possible to start from other than here");
        }

        boolean [][] visited = new boolean[N][N];
        visited[0][0] = true;

        traverseRatInMaze(0,0,N,matrix,visited, "");

    }

}
