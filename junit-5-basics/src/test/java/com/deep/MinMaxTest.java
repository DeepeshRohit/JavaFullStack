package com.deep;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinMaxTest {

	 int[] array = new int[] {3,34,32,12,56,45,48};

	    @Test
	    public void shouldBeMaxValue() {
	        int maxValue = MinMax.getMaxValue(array);
	        assert(maxValue == 56);
	    }

	    @Test
	    public void shouldBeMinValue() {
	        int minValue = MinMax.getMinValue(array);
	        assert(minValue == 3);
	    }
	    @Test
	    public void shouldBeMinMaxValue() {
	       int minValue = MinMax.getMinValue(array);
	       int maxValue = MinMax.getMaxValue(array);
	       int[] minMax = {minValue, maxValue};
	       assert(minMax[0]==3&& minMax[1]==56);
	       
	       
	      
	        
	    }
}
