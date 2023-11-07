package BeginnerJava;
public class EmployeeApp {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setData("amar", 02633, 12200);
		System.out.println(emp.getPerson());
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
	}

}
