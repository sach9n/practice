package BasicsOFMathematics;

public class GreatestCommondivosor {
    // eg 60 and  30 / both of them you will get a common divisor you have to get that

    //
    //step  1 get the min val of both a and  b divide it with the min value  each time  you get the  ans
    // O(Math.min(a,b);
    public static void getGcd(int a , int b){
        int minNumber = Math.min(a,b);

        // Apply it in  the loop
        while(minNumber>0){
            if(a%minNumber==0 && b%minNumber==0){
                System.out.println("The GCD is : "+ minNumber);
                return;
            }
            minNumber--;
        }
    }

    // Ecledian principle to find this
    // A and B gcd == b%a && a
    // recursive
    public static int  RecursiveGcd(int a , int b){
        if(b==0){
            return a;
        }

        return RecursiveGcd(b, a%b);
    }


    public static void main(String[] args) {
       getGcd(60,36);
     int ans =   RecursiveGcd(60,36);
        System.out.println(ans);
    }
}
