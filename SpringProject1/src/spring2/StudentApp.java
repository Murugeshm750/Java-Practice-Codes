package spring2;

import java.util.*;

public class StudentApp {

	List<String> skills;
	Set <String> mobiles;
	Map <String,String> marks;
	
	
	@Override
	public String toString() {
		return "StudentApp [skills=" + skills + ", mobiles=" + mobiles + ", marks=" + marks + "]";
	}
	
	public StudentApp(List<String> skills, Set<String> mobiles, Map<String, String> marks) {
		super();
		this.skills = skills;
		this.mobiles = mobiles;
		this.marks = marks;
	}
	
	
	public StudentApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<String, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}
	
	
	
}
