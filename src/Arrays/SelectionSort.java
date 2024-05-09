package Arrays;

public class SelectionSort {

    // swap
    public static void swap(int[]num, int a ,int b){
        int c = num[a];
        num[a]= num[b];
        num[b] = c;
    }

    public static void selectionSort(int[] array){

        int n = array.length;

        for(int i = 0;i<n-1;i++){
            int  min = i ;
            for(int j=i+1;j< n;j++){
                if(array[j]< array[min]){
                    min =  j;
                }

            }
            swap(array,i,min);
        }
    }


    public static void main(String[] args) {
        int[]array = {9,1,0,2,4,7,8,6};
        selectionSort(array);
        for(int x: array){
            System.out.print(x +" ");
        }
    }
}
