package Bitmanipulation;

public class getKthbit {

    public static int getkth(int num , int k){
        return num & 1<<k;
    }


    public static void main(String[] args) {
       int num = 12;
        int nums = getkth(num,3);
        System.out.println(nums);
    }
}
