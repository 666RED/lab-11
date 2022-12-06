package exercise1;

public class Main {

	public static void main(String[] args) {
		Guitar myGuitar = new Guitar();
		
		myGuitar.setInfo("Gibson", "black");
		
		Drum myDrum = new Drum();
		
		myDrum.setInfo("Tama", 1000);
		
		System.out.println("My guitar");
		System.out.println("Brand: " + myGuitar.getBrand());
		System.out.println("Color: " + myGuitar.getColor());
		myGuitar.getSound("Red");
		
		System.out.println("\nMy Drum");
		System.out.println("Brand: " + myDrum.getBrand());
		System.out.printf("Price: RM %.2f", myDrum.getPrice());
		myDrum.getSound(5);
	}

}
