package Strings;

import java.util.HashMap;
import java.util.Map;

public class subsetArray {

    public static boolean isSubset(int[]arr1, int []arr2){

        Map<Integer, Integer> map = new HashMap<>();
        for(int nums : arr1){
            map.put(nums, map.getOrDefault(nums,0)+1);
        }

        for(int nums2 : arr2){
            if(!map.containsKey(nums2)|| map.get(nums2)== 0){
                return  false;
            }

            map.put(nums2, map.get(nums2)-1);
        }

        return  true;
    }

    public static boolean OneMoreMethod(int[]arr1, int []arr2) {

        for(int c: arr2){
            if(indexOf(arr1,c)==-1){
                return false ;
            }
        }
        return true;
    }

    public static int indexOf(int[]arr, int element){
        for(int elem : arr){
            if(elem == element){
                return 0;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int []arr1={11,7,1,13,21,3,7,3};
        int[]arr2 = {11,3,7,1,7};
        System.out.println(isSubset(arr1, arr2));
        System.out.println(OneMoreMethod(arr1, arr2));
    }
}
