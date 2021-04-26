package Exercise4_1;

public class Strawberry extends Fruit { // subclass for Fruit
	private double price;
	private int quantity;
	private double size;
	
	public Strawberry(String name, double p, int q, double s) {
		super(name);
		this.price = p;
		this.quantity = q;
		this.size = s;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public double calTotalPrice() {
		return this.price*this.quantity;
	}
	
	public String toString() {
		return super.toString() + "\nPrice: RM " + price + "\nQuantity: " + quantity + "\nSize: " + size + "mm";
	}
}
