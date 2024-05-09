package Arrays;

public class BubbleSort {

    public static void swap(int[]num, int a ,int b){
        int c = num[a];
        num[a]= num[b];
        num[b] = c;
    }
   //O(nsquare)
    public static void bubble(int[]sort ){
        int  n = sort.length;

        for(int i = 0; i < n;i++){
            boolean swap = false;
            for(int j = 0; j<n-i-1;j++){
                swap = true;
                if(sort[j] > sort[j+1]){
                    swap(sort, j, j+1);

                }
            }
            if(!swap){
                return;
            }
        }

    }



    public static void main(String[] args) {
        int []arr = {1,9,3,5,4,2,0};
         bubble(arr);
         for(int x: arr){
             System.out.print(x + " ");
         }






    }
}
