package Arrays;

public class MergeSort {
    // steps first divide and merge
    public static void  merge(int[]nums,int l, int r, int mid){
        // number of values in an array
        int n1 = mid-l+1;
        int n2 = r -mid;
        int[] leftSide = new int[n1];
        int[] rightSide =new int[n2];

        // first merge the left side array
        // also right side to
        for(int i =0;i < n1;i++){
            leftSide[i]= nums[i+l];
        }
        for(int i= 0;i< n2;i++){
            rightSide[i]= nums[mid+1+i];
        }

        int i = 0, j = 0, index = l;
        for(;i<n1 && j<n2 ;index++){
            if(leftSide[i]<rightSide[j]){
                nums[index] = leftSide[i];
                i++;
            }else {
                nums[index] = rightSide[j];
                j++;
            }
        }

        for(;i < n1;index++){
            nums[index] = leftSide[i];
            i++;
        }

        for(;j < n2;index++){
            nums[index] = rightSide[j];
            j++;
        }
    }





    // split
    public static void splitAndMerge(int[]nums,int l, int r){
        if(l< r){
            int mid = (l + (r-l)/2);
            splitAndMerge(nums,l,mid);
            splitAndMerge(nums,mid+1,r);
            merge(nums,l,r,mid);
        }
    }



    //mergeSort
    public static void mergeSort(int[]nums){
        splitAndMerge(nums,0, nums.length-1);

    }


    public static void main(String[] args) {
        int[]array = {9,1,0,2,4,7,8,6};
       mergeSort(array);
        for(int x: array){
            System.out.print(x +" ");
        }
    }
}
