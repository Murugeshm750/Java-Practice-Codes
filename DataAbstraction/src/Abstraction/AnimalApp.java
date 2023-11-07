package Abstraction;

public class AnimalApp {
	public static void main(String[] args) {
		
		Horse horse = new Horse();
		Deer deer = new Deer();
		Tiger tiger = new Tiger();
		Fox fox = new Fox();
		
		Forest f = new Forest();
		
		f.permit(horse);

		System.out.println("----------------------");
		f.permit(deer);
		System.out.println("----------------------");
		f.permit(tiger);
		System.out.println("----------------------");
		f.permit(fox);
		System.out.println("----------------------");
	

		
		
	
	
	}

}
