package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class generateBinaryString {

    public static void generateString(int n, String curr, List<String> result){
        // never forget to add terminating conditions
        if(curr.length()==n){
            result.add(curr);
            return;
        }


        // number of possible solution is
        generateString(n,curr+"0",result);
        generateString(n,curr+"1",result);
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> result = new ArrayList<>();
        generateString(n,"",result);
        System.out.println(result);

    }
}
