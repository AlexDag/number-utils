package odesk.asemeshchenko.numberUtils;

import java.util.Arrays;

/**
 * 
 * @author asemeshchenko
 * Class for function Rotate item position into array by shift value
 */
public class RotatePosition {
	/**
	 * 
	 * @param shift
	 * @param array
	 * @return array with items rotated positions 
	 */
	public static  int[]  rotate(int shift,  int[] array){
		int[] result=new int[array.length];
		int[] tmp = Arrays.copyOf(array, array.length);
		for(int i=0;i<shift;i++){
				// copy one number from last position to first position
			System.arraycopy(tmp, tmp.length-1, result, 0, 1);
				// copy rest array items except last item
		    System.arraycopy(tmp, 0, result, 1, tmp.length-1);
			tmp = Arrays.copyOf(result, result.length);
		}
		return result;
	}
}
