package Training;

public class Constructor {
	private String name;
	private int id,salary;
	public Constructor (String name,int id, int salary)
	{
	this.name=name;
	this.id=id;
	this.salary=salary;
	
	}
	public String name()
	{
		return  name;
	}
	public int id () 
	{
		return id;
	}
	public int salary ()
	{
		return salary;
	}
	public static void main(String[] args) {
		Constructor e = new Constructor("mugesh", 12345, 1200000);
		System.out.println(e.name());
		System.out.println(e.id());
		System.out.println(e.salary());
	}
}
