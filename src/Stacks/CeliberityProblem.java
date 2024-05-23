package Stacks;

import java.util.Stack;

public class CeliberityProblem {

    public static int celiberity(int[][]M, int n){
        Stack<Integer> s = new Stack<>();
         int celeb=0;
        for(int i= 0; i< n;i++) s.push(i);

        while(s.size()>1){
            int a = s.pop();
            int b = s.peek();

            if(M[a][b]==1 && M[b][a]==0){
                s.push(b);
            }else if(M[a][b]==0 && M[b][a]==1){
                s.push(a);
            }

            if(s.size()==0) return -1;

             celeb =s.pop();

            for(int i=0;i<n;i++){
                if(i!=celeb && M[i][celeb]==0){
                    return -1;
                }
            }

        }
       return celeb;
    }


}
