package edu.uwm.cs351;

/**
 * A robot with (almost) all fixed parts:
 * two arms, two legs and one other part that is neither an arm or a leg
 */
public class FixedRobot implements Robot {
	private static final String ARM = "arm";
	private static final String LEG = "leg";
	private Part arm1, arm2;
	private Part leg1, leg2;
	private String otherFunction;
	private Part otherPart;
	
	/**
	 * Create a new fixed robot without parts.
	 */
	public FixedRobot() {
		// nothing to do
	}
	
	@Override // required
	public boolean addPart(String function, Part part) {
		// TODO
		if (function == null || part == null) throw new NullPointerException("The parameters can't be empty");
		
		if (function.equals(ARM)) {
	        if (arm1 == null) {
	            arm1 = part;
	            return true;
	        } else if (arm2 == null) {
	            arm2 = part;
	            return true;
	        }
	    } else if (function.equals(LEG)) {
	        if (leg1 == null) {
	            leg1 = part;
	            return true;
	        } else if (leg2 == null) {
	            leg2 = part;
	            return true;
	        }
	    } else if (otherFunction == null) {
	        otherFunction = function;
	        otherPart = part;
	        return true;
	    }

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
