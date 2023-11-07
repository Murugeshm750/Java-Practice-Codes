package Training;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1 = new Employee("Amar",12345,100000);
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1.getSalary());
	}
}
