package pl.stanikov.app.main;

public class Dog extends Pet{
	
	public Dog(String name, String rasa, int id) {
		super(name, rasa, id);
	}
	
	public void makeNoise() {
		System.out.println("Wof Wof!!!");
	}

}