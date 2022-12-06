package exercise1;

public class Guitar extends Instrument{
	private String color;
	
	public void setInfo(String brand, String color) {
		super.setInfo(brand);
		this.color = color;
	}
	
	public void getSound(String guitarist) {
		System.out.println(guitarist + "'s guitar says: a-woogah woogah");
	}
	
	public String getColor() {
		return color;
	}
}
