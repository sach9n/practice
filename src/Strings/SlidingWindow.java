package Strings;

public class SlidingWindow {

     public static void slidingWindow(String str, String pattern){
         int n = str.length();
         int m = pattern.length();

         for(int i =0; i<= n-m;i++){
             int j =0;
             for(;j< m;j++){
                 if(str.charAt(i+j)!=pattern.charAt(j)){
                     break;
                 }
             }
             if(j==m){
                 System.out.println("The pattern exists at index " + i);

             }
         }
     }

  // T.c = BigO(M*N)
    public static void main(String[] args) {
        String str = "abcdefbczmno";
        String pattern = "bcz";

        slidingWindow(str,pattern);
    }
}
