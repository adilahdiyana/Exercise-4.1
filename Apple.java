package Exercise4_1;

public class Apple extends Fruit { // subclass for fruit
	private double price;
	private int quantity;
	
	public Apple(String name, double p, int q) {
		super(name);
		this.price = p;
		this.quantity = q;
	}

	
	public double getTotalPrice() {
		return this.price*this.quantity;
	}
	
	
	public String toString() {
		return super.toString() + "\nPrice: RM " + price + "\nQuantity: " + quantity + "\nTotal price: RM " + getTotalPrice();
	}
}
