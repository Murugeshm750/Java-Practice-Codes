package Inheritence;

public class Application {
	void Teach()
	{
		System.out.println("Teacher is Teaching");
	}
	void Attendence () 
	{
		System.out.println("Teacher is Taking a Attendence");
	}
	public static void main(String[] args) {
		PhysicsTeacher p1 =new PhysicsTeacher ();
		p1.Teach();
		p1.Attendence();
		p1.project();
		ChemistryTeacher c1 =new ChemistryTeacher ();
		c1.Teach();
		c1.Attendence();
		c1.project();
	}

}
