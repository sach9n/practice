package BasicsOFMathematics;

public class maxAtaPoint {

    public static int getValue(int[][]nums){
        int count = 0;
        for(int i=0;i< nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                System.out.print(nums[j][i]);
            }
            System.out.println();
        }

        return count;
    }
    public static void main(String[] args) {
        int[][]arr = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        getValue(arr);
    }
}
