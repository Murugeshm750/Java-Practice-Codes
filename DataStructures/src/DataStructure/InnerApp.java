package DataStructure;

//import DataStructure.Outer.Inner;

public class InnerApp {
public static void main(String[] args) {
	Outer o = new Outer();
	
	Outer.Inner i =o.new Inner();
	o.display();
}
}
