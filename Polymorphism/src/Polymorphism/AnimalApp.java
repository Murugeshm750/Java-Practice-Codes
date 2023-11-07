package Polymorphism;

public class AnimalApp {
	public static void main(String[] args) {
		Dog d = new Dog();
		Monkey m = new Monkey();
		Tiger t = new Tiger ();
		Forest f = new Forest ();
		f.permit(d);
		f.permit(m);
		f.permit(t);
	}

}
