package Strings;

public class ReverseString {


    public  static  String reverseString(String str){
        int n = str.length();
        String ans ="";
        String temp = "";

        for(char ch: str.toCharArray()){
            if(ch!=' '){
                temp+= ch;
            } else if (temp!=" ") {
                if(ans.equals("")){
                    ans = temp;
                }else {
                    ans = temp+" "+ans;
                }
              temp="";
            }
        }

        if(temp != ""){
            if(ans.equals("")){
                ans = temp;
            }else{
                ans = temp +" "+ans;
            }
        }
        return ans;
    }

    public static void reverseStr(char[] s) {
        int n = s.length-1;
        int i = 0;
        while(n>=i){
            System.out.print(s[n]);
            n--;
        }
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseString(str));

        char [] s = {'h','e','l','l','o'};
        reverseStr(s);

    }
}
