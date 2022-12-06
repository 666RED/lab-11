package exercise1;

public class Drum extends Instrument{
	private double price;
	
	public void setInfo(String brand, double price) {
		super.setInfo(brand);
		this.price = price;
	}
	
	public void getSound(int numOfHit) {
	
		System.out.println("\nParty Time!");
		for(int i = 0; i < numOfHit; i++) {
			System.out.println("da-dum-da-dum");
		}
	}
	
	public double getPrice() {
		return price;
	}
}
