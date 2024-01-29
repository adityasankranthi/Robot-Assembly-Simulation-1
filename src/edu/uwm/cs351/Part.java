package edu.uwm.cs351;

import java.util.Random;

/**
 * A part of a robot.
 * This class is immutable.
 * Currently all it has is a serial "number" 
 */
public class Part {
	private final String serialNumber;
	
	/**
	 * Create a part with the given serial number
	 * @param serial serial number, must not be null
	 */
	public Part(String serial) {
		if (serial == null) throw new NullPointerException("Null serial number");
		this.serialNumber = serial;
	}
	
	/**
	 * Create a part with a random serial number.
	 */
	public Part() {
		// filling in the "..." with a random string which
		// can indeed be a series of digits.
		// Our solution uses "new Random().nextInt()" as part of this.
		this("RBT" + new Random().nextInt());
	}
	
	/**
	 * return the serial number.
	 * @return serial number, the part's serial number
	 */
	public String getSerial() {
		return this.serialNumber;
	}
	
	/**
	 * compares two part's serial number
	 * @param Object, object to be compared to.
	 * @return if the parts have the same serial number
	 */
	@Override //implementation
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
	 * return the hash-code of the serial number.
	 * @return hashcode of the serial number.
	 */
	@Override //implementation
	public int hashCode() {
		return this.serialNumber.hashCode();
	}
	
	/**
	 * String representation of the part's serial number
	 * @return the string “Part(serial number)”.
	 */
	@Override //implementation
	public String toString() {
		return "Part(" + this.getSerial() + ")";
	}
}