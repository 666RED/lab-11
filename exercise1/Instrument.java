package exercise1;

public class Instrument {
	private String brand;
	
	public void setInfo(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void getSound() {
		System.out.println("Every instrument produces a sound");
	}
	
}
