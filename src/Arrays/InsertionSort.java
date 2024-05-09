package Arrays;

public class InsertionSort {
    public static void insertionSort(int []nums){
        int n= nums.length;
        int hole,value;

        for(int i =1; i < n;i++){
            value = nums[i];
            hole = i-1;
            while(hole >= 0 && nums[hole]>=value){
                 nums[hole+1] = nums[hole];
                 hole--;
            }
            nums[hole+1] = value;
        }
    }
    public static void main(String[] args) {
        int[]value  = {9,1,4,2,3,4,8,5,0};
        insertionSort(value);
        for(int x: value){
            System.out.print(x + " ");
        }
    }
}
