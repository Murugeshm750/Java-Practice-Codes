package Abstraction;

public class AreaApp {
	public static void main(String[] args) {
		Square s = new Square();
		s.acceptInput();
		s.compute();
		s.area();
		System.out.println("-----------------------");
		
		Rectangle r = new Rectangle();
		r.aceeptInput();
		r.compute();
		r.area();
		System.out.println("-----------------------");
		
		Circle c =new Circle();
		c.acceptInput();
		c.compute();
		c.area();
	}

}
