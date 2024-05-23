package BasicsOFMathematics;

import com.sun.security.jgss.GSSUtil;

public class Factrioal {

    public static void Factorial(int n ){
        int count = 0;

            for(int i =5;i>=1;i*=5){
                count+= n/i;
            }
        System.out.println(count);
    }

    // Square root of the number
    // 2 * 2 = 4 sqrt(4)==2
    public static void getRoot(int x){
        int count = 3;
        double n = 2;

        while(count > 0){
            n =   0.5 * (n + x/n);
            count--;
        }
        System.out.println((int)n);
    }

    public static void main(String[] args) {
        Factorial(5);

        int val = 8;
        System.out.println(val);
        getRoot(1024);
    }
}
