package Backtracking;

public class TowerOfHanoi {
    // Tower Of hanoi
    // Getting the tower of hanoi
    public static void towerOfHanoi(int num, char src,char aux,char dest){

        if(num==1){
            System.out.println(src  + " passed to " + dest);
            return;
        }


        towerOfHanoi(num-1,src,dest,aux);
        System.out.println(num + " is moveing to from "  + src + "to " + dest);
        towerOfHanoi(num-1, aux,dest,src);

    }



    public static void main(String[] args) {

        int num = 3;
        char src = 'A';
        char aux  = 'B';
        char dest = 'C';

        towerOfHanoi(num,src,aux,dest);

    }
}
