package employeepayrolesystem;

public class Fulltimeemployee extends Employee {
	private int salary;
	
	public Fulltimeemployee(int id, String name, int salary) {
		super(name,id);
		this.salary = salary;
	}
	
	@Override
	public int salaryDetails() {
		return salary;
	}
}
