package chapter1.section1;

import java.util.Arrays;

//此类只是用于找出数组中重复的元素，并非删除
public class DumplicateElements {

    public static void main(String[] args) {
        int[] N = {1,2,2,3,4,5,6,6,7,8,9};
        System.out.println("original array:"+ N.toString());
        int[] resultArray = searchDumplicateElements(N);
        System.out.println("result array:"+ Arrays.toString(resultArray));
        
    }
    
    public static  int[]  searchDumplicateElements (int[] array) {
        
        int[] tempArray = new int[array.length];
        int sameNumTime = 0;
        for(int i = 0 ; i < array.length ; i ++){
            if (i == array.length - 1) {
                break;
            }
        
            if (array[i] == array[i + 1]) {
                tempArray[sameNumTime] = array[i];
                sameNumTime ++ ;
            }
        }
        
        int[] resultArray = new int[sameNumTime];
        for(int j = 0 ; j < sameNumTime ; j ++)
            resultArray[j] = tempArray[j];
        
        
        return resultArray;
    }
    
    
}

