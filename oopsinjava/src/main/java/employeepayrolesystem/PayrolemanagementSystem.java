package employeepayrolesystem;

import java.util.ArrayList;

public class PayrolemanagementSystem {
	
	ArrayList<Employee>employees = new ArrayList<Employee>();
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public void removeEmployee(int id) {
		for(Employee e : employees) {
			if(e.getEmployeeId()==id) {
				employees.remove(e);
			}
		}
	}
	
	public ArrayList<Employee> displayEmployees() {
		for(Employee e : employees) {
			System.out.println();
			e.toString();
		}
		return employees;
	}

}
