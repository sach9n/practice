package BasicsOFMathematics;

public class isPalandrium {


    public static boolean isPalan( int x){
        if(x < 0) return false ;
      //O(n) time complexity
        int reverse = 0;
        int original = x;

        while(x!=0){
            int digit  = x % 10;
            reverse = reverse * 10 + digit;
            x/=10;
        }

        return original==reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalan(121121));
    }
}
