package Bitmanipulation;

public class BitManipulation {

    // return the binary
    public static String getBinary(int num){
        // Covert the decimal to bianry

        StringBuilder binary = new StringBuilder();
        for(int i = 31; i>=0;i--){
            binary.append((num&(1<<i))==0?"0":"1");

        }


        return binary.toString();
    }




    // Convert sTring to numbers and sum them
    public static String getVal(String a, String b){
        int num1= Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int sum = num1 + num2;

        return  getBinary(sum);
    }



    public static void main(String[] args) {
        System.out.println(getVal("11","1"));
    }

}
