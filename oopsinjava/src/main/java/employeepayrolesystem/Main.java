package employeepayrolesystem;

public class Main {

	public static void main(String[] args) {
		PayrolemanagementSystem p = new PayrolemanagementSystem();
		Fulltimeemployee fte = new Fulltimeemployee(1, "Jeevan", 70000);
		p.addEmployee(fte);
		Fulltimeemployee fte2 = new Fulltimeemployee(2, "Hello", 9000);
		p.addEmployee(fte2);
//		p.removeEmployee(1);
		
		ParttimeEmployees pte = new ParttimeEmployees(3, "Chadarla", 5, 300);
		p.addEmployee(pte);
		
		System.out.println(p.displayEmployees());
	}
}
