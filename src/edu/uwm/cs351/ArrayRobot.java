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
	
	// TODO: First stub and then write this class
	//required
	public ArrayRobot() {
		
	}
	
	// required
	public ArrayRobot(int x) {
		
	}
	
	@Override // required
	public boolean addPart(String function, Part part) {
		// TODO
		return false;
	}
	
	@Override // required
	public Part removePart(String function) {
		Part result = null;
		// TODO
		return result;
	}
	
	@Override // required
	public Part getPart(String function, int index) {
		Part result = null;
		// TODO
		return result;
	}


}
