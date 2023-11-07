package Abstraction;

public class School {
	
	void permit (Teacher ref)
	{
		ref.teach();
		ref.takeAttendence();
		ref.doProject();
	}

}
