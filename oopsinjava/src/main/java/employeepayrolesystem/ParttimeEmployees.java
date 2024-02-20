package employeepayrolesystem;

public class ParttimeEmployees extends Employee{
	private int salary;
	
	public ParttimeEmployees(int id, String name, int hours, int perhrcharge) {
		super(name, id);
		this.salary = hours*perhrcharge;
	}
	
	@Override
	public int salaryDetails() {
		return salary;
	}
}
