package oops;

//  private - can be assessed/modified only in the same class only
//  public - can be assessed/modifies any where
// default - if the type is not mentioned it is considered as default
//   		 and it can be accessed only in that package.

// private variables can be exposed to other files using getters/setters
public class Student{
	String name;
	int rollNo;
	private double percent; 
	final String schoolName="KCRS";
	
	public Student() {
		// Default constructor
	}
	
	public Student(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		// parametarised constructor
	}
	
	public double getPercentage() {
		return percent;
	}
	
//	public void setPercentage(int newPercentage) {
//		percent = newPercentage;
//	}
	// both the same code - as above - this is to differentiate the variable with same names.
	public void setPercentage(int percent) {
		this.percent=percent;
	}
	
}
