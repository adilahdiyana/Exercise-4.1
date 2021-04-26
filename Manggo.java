package Exercise4_1;

public class Manggo extends Fruit { // subclass for Fruit
	private double price;
	private int quantity;
	private String brand;
	
	public Manggo(String name, double p, int q, String b) {
		super(name);
		this.price = p;
		this.quantity = q;
		this.brand = b;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String toString() {
		return super.toString() + "\nPrice: RM " + price + "\nQuantity: " + quantity + "\nBrand: " + brand;
	}

}
