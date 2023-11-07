package spring3;

public class Mobile {
	Charger c;
	
	

	@Override
	public String toString() {
		return "Mobile [c=" + c + "]";
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(Charger c) {
		super();
		this.c = c;
	}

	public Charger getC() {
		return c;
	}

	public void setC(Charger c) {
		this.c = c;
	}
	
	

}
