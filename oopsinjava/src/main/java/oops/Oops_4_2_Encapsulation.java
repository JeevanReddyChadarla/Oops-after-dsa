package oops;

//binding data members(variables/methods)
	// secure data.
	
	class Stud{
		// declaring the variables as private to protect it
		private String name;
		private int age;
		private int rollNo;
		// these variables can be assessed using getters and setters
		
		public String getName() {
			System.out.println(name);
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
	}

public class Oops_4_2_Encapsulation {

	public static void main(String[] args) {
		Stud s = new Stud();
		//s.name="Jeevan"; throws error since it is not assessible
		s.setName("Jeevan");
		s.getName();
	}

}
