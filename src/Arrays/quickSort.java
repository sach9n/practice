package Arrays;

public class quickSort {
    public static void swap(int[]num, int a ,int b){
        int c = num[a];
        num[a]= num[b];
        num[b] = c;
    }


   public static int pivotValue(int[]nums, int r, int l){
        int pivotVal = nums[r];
        int i = l , j = l-1;

        while(i < r){
            if(nums[i]< pivotVal){
                j++;
                swap(nums,i,j);
            }
            i++;
        }
        j++;
       swap(nums,i,j);
        return j;
   }

   public static void partionAndSort(int[]nums,int l, int r){
      if(l<r){
          int pivotIndex = pivotValue(nums, r, l);
          partionAndSort(nums,l,pivotIndex-1);
          partionAndSort(nums,pivotIndex+1,r);
      }

    }

   public static void quickSort(int[]arr){
        partionAndSort(arr,0,arr.length-1);
   }

    public static void main(String[] args) {
        int[]array = {9,1,0,2,4,7,8,6};
        quickSort(array);
        for(int x: array){
            System.out.print(x +" ");
        }
    }

}
