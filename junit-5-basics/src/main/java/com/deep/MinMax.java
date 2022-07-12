package com.deep;

public class MinMax {
	

    public static int getMaxValue(int[] array) {
        int value = Integer.MIN_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
            }
        }
        return value;
    }

    public static int getMinValue(int[] array) {
        int value = Integer.MAX_VALUE;


        for (int i=0; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }
        return value;
    }
    
    public static int[] getMinMax(int[] array)
    {  
    	
    int[] arr={MinMax.getMinValue(array),MinMax.getMaxValue(array)};  //initializing array  
    return arr;  
    }  

}