package employeepayrolesystem;

abstract public class Employee {
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.id=id;
		this.name=name;
	}
	public String getEmployeeName() {
		return name;
	}
	public int getEmployeeId() {
		return id;
	}
	
	abstract public int salaryDetails();
	
	@Override
	public String toString() {
		return "Employee id: "+id+" name: "+name;
	}
}
