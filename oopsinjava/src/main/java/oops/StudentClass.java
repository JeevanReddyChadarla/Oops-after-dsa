package oops;

public class StudentClass {
	// as long as student class and its object(consumer) are in same package, no import statement is needed
	
	public static Student newJoinee() {
		Student newJoin = new Student();
		newJoin.name="jeevan";
		newJoin.rollNo=42;
		newJoin.setPercentage(85);
		return newJoin;
	}
	
	public static Student updateDetails(Student s) {
		s.name="jeevanchadarla";
		return s;
	}
	public static void main(String[] args) {
		Student std = new Student();
		std=newJoinee();
		System.out.println(std.name+"   "+std.rollNo+"   "+std.getPercentage() );		
		std=updateDetails(newJoinee());
		System.out.println(std.name+"   "+std.rollNo+"   "+std.getPercentage() );
		
		Student s = new Student();
		s.name="hello";
		s.rollNo=78;
		s.setPercentage(99);
		s.getPercentage();
		// the above code uses default constructor
		System.out.println(s.name+"  "+s.rollNo+"  "+s.getPercentage()+"  "+s.schoolName);
		
		
		Student k = new Student("constructor_parametarised", 86);
		System.out.println(k.name);
		System.out.println(s.schoolName);
		// the above code uses parametarised constructor
	}

}
