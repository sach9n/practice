package Arrays;

public class trappingRainWater {

     public static int trapOptimized(int[]height){
         // Two pointer O(n) and O(1)

         int n = height.length;
         int l = 0;
         int r = n-2;
         int lMax = height[0];
         int rMax = height[n-1];

         int saved = 0;

         while(l<=r){
             if(lMax<=rMax){
                 if(height[l] <= lMax){
                     saved+= lMax-height[l];
                 }else {
                     lMax = height[l];
                 }
                 l++;
             }else {
                 if(height[r]<= rMax){
                     saved+= rMax-height[r];
                 }else {
                     rMax = height[r];
                 }
                 r--;
             }
         }

         return saved;
     }



     public static void trapAmount(int[] height){
         int n = height.length;
         int[]leftMax = new int[n];
         int[]rightMax = new int[n];

        leftMax[0] = Integer.MIN_VALUE;
        for(int i = 1;i< n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
        }

         rightMax[n-1] = Integer.MIN_VALUE;
         for(int i = n-2;i>=0;i--){
             rightMax[i] = Math.max(rightMax[i+1],height[i+1]);
         }

         int waterSaved = 0;
         for(int i = 1; i< n-1;i++){
             waterSaved += Math.max( 0 , Math.min(leftMax[i], rightMax[i])-height[i]);

         }

         System.out.println(waterSaved);
     }
    public static void main(String[] args) {
        int [] array = {4,2,0,3,2,5};
        trapAmount(array);
    }
}
