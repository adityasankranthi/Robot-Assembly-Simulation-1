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
        if (function == null || part == null) throw new NullPointerException("Function and part cannot be null");
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
        } else if (otherFunction == null){
	        otherFunction = function;
	        otherPart = part;
	        return true;
        }
        return false;
    }

	@Override // required
    public Part removePart(String function) {
        Part removedPart = null;
        if (function == null) {
            if (arm1 != null) {
                removedPart = arm1;
                arm1 = null;
            } 
            else if (arm2 != null) {
                removedPart = arm2;
                arm2 = null;
            }
            else if (leg1 != null) {
                removedPart = leg1;
                leg1 = null;
            } 
            else if (leg2 != null) {
                removedPart = leg2;
                leg2 = null;
            }
            else if(otherPart != null) {
                removedPart = otherPart;
                otherPart = null;
            }
        }
        else if (function.equals(ARM)) {
            if (arm1 != null) {
                removedPart = arm1;
                arm1 = null;
            } else if (arm2 != null) {
                removedPart = arm2;
                arm2 = null;
            }
        } else if (function.equals(LEG)) {
            if (leg1 != null) {
                removedPart = leg1;
                leg1 = null;
            } else if (leg2 != null) {
                removedPart = leg2;
                leg2 = null;
            }
        } else if (function.equals(otherFunction)){
            if (otherPart != null) {
                removedPart = otherPart;
                otherPart = null;
            }
        }
        return removedPart;
    }

	@Override // required
    public Part getPart(String function, int index) {
    	if (index < 0 ) throw new IllegalArgumentException("index can't be negative");
        if (function == null) {
        	int arm1Index = 0;
        	int arm2Index = 1;
        	int leg1Index = 2;
        	int leg2Index = 3;
        	int otherPartIndex = 4;
        	int currentIndex = 0;
        	if (arm1 != null) {
        		currentIndex = 0;
        	}
        	else if (arm2 != null) {
        		currentIndex = 1;
        	}
        	else if (leg1 != null) {
        		currentIndex = 2;
        	}
        	else if (leg2 != null) {
        		currentIndex = 3;
        	}
        	else if (otherPart != null) {
        		currentIndex = 4;
        	}
        	if (arm1 != null && arm1Index - currentIndex == index) {
        		return arm1;
        	}
        	else if (arm2 != null && arm2Index - currentIndex == index) {
        		return arm2;
        	}
        	else if (leg1 != null && leg1Index - currentIndex == index) {
        		return leg1;
        	}
        	else if (leg2 != null && leg2Index - currentIndex == index) {
        		return leg2;
        	}
        	else if (otherPart != null && otherPartIndex - currentIndex == index) {
        		return otherPart;
        	}
        }
        else if (function.equals(ARM)) {
            if (index == 0 && arm1 != null) {
                return arm1;
            } else if (index == 1 && arm2 != null) {
                return arm2;
            } else if (index == 0 && arm1 == null && arm2 != null){
                return arm2; 
            }
            else {
            	return null;
            }
        } else if (function.equals(LEG)) {
        	 if (index == 0 && leg1 != null) {
                 return leg1;
             } else if (index == 1 && leg2 != null) {
                 return leg2;
             } else if (index == 0 && leg1 == null && leg2 != null){
                 return leg2; 
             }
             else {
             	return null;
             }
        } else {
            if (index == 0 && otherPart != null) {
                return otherPart;
            } else {
                return null; 
            }
        }
        return null;
    }
 }