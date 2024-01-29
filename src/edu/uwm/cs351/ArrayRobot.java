package edu.uwm.cs351;

/**
 * An implementation of {@link Robot} 
 * that can maintain a fixed number of parts
 * of any type.
 */

public class ArrayRobot implements Robot {
	public static final int DEFAULT_CAPACITY = 6;
	private String[] functions;
	private Part[] parts;
	
	/**
	 * Create a new Array robot with default capacity and no parts.
	 */
	public ArrayRobot() {
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * Create a new Array robot with specified capacity and no parts.
	 * @param capacity of the Array, must not be null
	 */
	public ArrayRobot(int capacity) {
		functions = new String[capacity];
		parts = new Part[capacity];
	}
	
	@Override // required
	public boolean addPart(String function, Part part) {
        if (function == null || part == null) throw new NullPointerException("Function and part cannot be null");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i] == null) {
                functions[i] = function;
                parts[i] = part;
                return true;
            }
        }
        return false;
    }
	
	@Override // required
	public Part removePart(String function) {
		if (function == null) {
			for (int i = 0; i < functions.length; i++) {
	            if (functions[i] != null) {
	                Part removedPart = parts[i];
	                functions[i] = null;
	                parts[i] = null;
	                return removedPart;
	            }
			}
		}
		else {
			for (int i = 0; i < functions.length; i++) {
	            if (functions[i] != null && functions[i].equals(function)) {
	                Part removedPart = parts[i];
	                functions[i] = null;
	                parts[i] = null;
	                return removedPart;
	            }
			}
        }
        return null; 
	}
	
	@Override // required
	public Part getPart(String function, int index) {
		if (index < 0 ) throw new IllegalArgumentException("index can't be negative");
		Part result = null;
		int count = 0;
		if (function == null) {
			for (int i = 0; i < functions.length; i++) {
	            if (functions[i] != null) {
	                if (count == index) {
	                    return parts[i];
	                }
	                count++;
	            }
	        }
		}
		else {
			for (int i = 0; i < functions.length; i++) {
	            if (functions[i] != null && functions[i].equals(function)) {
	                if (count == index) {
	                    return parts[i];
	                }
	                count++;
	            }
	        }
		}
        return result;
    }
}