package Backtracking.Partprepartion;

public class BackParenthesis {

    public static void getParenthesis(String curr, int n , int diff){
        //Eleminatng
        if(diff==0 && curr.length()==2*n){
            System.out.println(curr);
            return;
        }

        if(curr.length()==2*n|| diff<0){
            return;
        }


        // Set stage
        getParenthesis(curr+"(" ,n,diff+1);
        getParenthesis(curr+")",n,diff-1);
    }

    public static void main(String[] args) {
        int n = 4;

        getParenthesis("", n , 0);
    }
}
