package odesk.asemeshchenko.numberUtils;

import static org.junit.Assert.assertEquals;
import odesk.asemeshchenko.numberUtils.RotatePosition;

import org.junit.Test;

public class RotationTest {

	/**
	 * Test to rotate position items into array by shift value 
	 */
	@Test
	public void rotationPosition(){
		int[] array = {1,2,3,4,5,6,7,8,9};
		int shift= 2;
		
		int[] result=RotatePosition.rotate(shift, array);
		
		assertEquals(result[0], 8);
		assertEquals(result[1], 9);
	}
}
