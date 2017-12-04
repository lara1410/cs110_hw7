package utils;

import animals.Puppy;


public class Math {
    public static int factorial(int n){
        if(n <= 1){
            return 1;
          }else{
        return n * factorial(n-1);
      }
    }
    public static int factorialLoop(int n){
        if( n <= 1)
            return 1;
        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
