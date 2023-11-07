package Abstraction;

public class TeacherApp {
	public static void main(String[] args) {
		
		PhysicsTeacher pt = new PhysicsTeacher();
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher();
		
		School s =new School();
		
		s.permit(pt);
		s.permit(ct);
		s.permit(bt);
		
	}

}
