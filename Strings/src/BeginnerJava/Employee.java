package BeginnerJava;
public class Employee {
	private String employeeName;
	private int id;
	private int salary;
	public void setData(String x,int y,int z) {
		employeeName=x;
		id=y;
		salary=z;
	}
	public String getPerson() {
		return employeeName;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
}
