package Training;

public class Encaps {
	private String name;
	private int id,salary;
	public void setData (String name,int id, int salary)
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
		Encaps e = new Encaps();
		e.setData("mugesh", 12345, 1200000);
		System.out.println(e.name());
		System.out.println(e.id());
		System.out.println(e.salary());
	}
}



















