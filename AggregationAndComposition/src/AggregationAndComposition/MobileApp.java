package AggregationAndComposition;

public class MobileApp {
	public static void main(String[] args) {
		
		//Create the Enclosing Object
		
		Mobile m = new Mobile();
		
		//Accessing the Member Function of Composition Object using Enclosing Object
		System.out.println(m.os.getName());
		
		//Accessing the Member Function of Aggregation Object using Enclosing Object
		System.out.println(m.c.getBrand());
		
		
		
		//Accessing the Member Function of Aggregate Object without using Enclosing Object

		Charger c = new Charger ("one plus");
        System.out.println(c.getBrand());
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Create Aggregate Object
		/*
		Charger c = new Charger ("One plus");
		
		//Accessing the Member Function of Aggregate Object using Enclosing Object
		m.hasA(c);
		*/
		
	

		
	}

}
