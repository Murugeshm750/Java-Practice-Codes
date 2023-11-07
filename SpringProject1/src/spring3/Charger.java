package spring3;

public class Charger {
	
	String brand;

	
	
	@Override
	public String toString() {
		return "Charger [brand=" + brand + "]";
	}

	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Charger(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}
