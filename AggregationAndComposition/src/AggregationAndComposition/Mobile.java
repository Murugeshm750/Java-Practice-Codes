package AggregationAndComposition;

public class Mobile {
	//Creating the Composite Object
	
	Os os = new Os("Android");
	
	//Creating a Mechanism to Connect Enclosing Object with Aggregate Oblect
	
	/*
	public void hasA(Charger ref)
	{
		System.out.println(ref.getBrand());
	}
	*/
	
	//Creating the Aggregate Object
	Charger c = new Charger ("One plus");
	
	

}
