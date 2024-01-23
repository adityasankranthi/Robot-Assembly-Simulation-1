package edu.uwm.cs351;

import java.util.Random;

/**
 * A part of a robot.
 * This class is immutable.
 * Currently all it has is a serial "number" 
 */
public class Part {
	// TODO: Declare the (very simple) data structure.
	
	
	/**
	 * Create a part with the given serial number
	 * @param serial serial number, must not be null
	 */
	public Part(String serial) {
		// TODO: initialize the part after checking for errors.
	}
	
	/**
	 * Create a part with a random serial number.
	 */
	public Part() {
		// TODO: call the other constructor with "this(...)"
		// filling in the "..." with a random string which
		// can indeed be a series of digits.
		// Our solution uses "new Random().nextInt()" as part of this.
	}
	
	// TODO: Methods of the class
}
