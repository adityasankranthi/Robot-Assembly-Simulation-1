package edu.uwm.cs351;

import java.util.Random;

/**
 * A part of a robot.
 * This class is immutable.
 * Currently all it has is a serial "number" 
 */
public class Part {
	// TODO: Declare the (very simple) data structure.
	private final String serialNumber;
	
	/**
	 * Create a part with the given serial number
	 * @param serial serial number, must not be null
	 */
	public Part(String serial) {
		// TODO: initialize the part after checking for errors.
		if (serial == null) throw new NullPointerException("Null serial number");
		this.serialNumber = serial;
	}
	
	/**
	 * Create a part with a random serial number.
	 */
	public Part() {
		this("" + new Random().nextInt());
		// TODO: call the other constructor with "this(...)"
		// filling in the "..." with a random string which
		// can indeed be a series of digits.
		// Our solution uses "new Random().nextInt()" as part of this.
		
	}
	
	// TODO: Methods of the class
	
	/**
	 * @return the part’s serial number.
	 */
	public String getSerial() {
		return this.serialNumber;
	}
	
	/**
	 * @param Object to be compared to.
	 * @return Return true if the argument is a part with the same serial number as
	 * this.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Part) {
			Part guest = (Part) obj;
			if (guest.serialNumber.equals(this.serialNumber)) return true;	
		}
		return false;
	}
	
	/**
	 * @return the hashcode of the serial number.
	 */
	@Override
	public int hashCode() {
		return this.serialNumber.hashCode();
	}
	
}
	

