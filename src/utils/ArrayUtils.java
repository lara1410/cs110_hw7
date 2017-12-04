package utils;


public class ArrayUtils {
    public static void reverse(int [] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = array[i];
            array[i] = temp;
        }
    }
    public static String stringifyArray(int [] array){
        if(array.length == 1)
            return array[0] + "";
        String result = "";
        for(int i = 0; i < array.length - 1; i++ )
            result += array[i] + ",";
        result += array[array.length-1];
        return result;
    }
