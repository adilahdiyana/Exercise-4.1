package Exercise4_1;

public class RedApple extends Apple { // subclass for Apple
	private double weight;
	private String taste;
    
	public RedApple(String name, double p, int q, double w, String t) {
		super(name, p, q);
		this.weight = w;
		this.taste = t;
		
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	
	public String toString() {
		return super.toString() + "\nWeight: " + weight + "kg" + "\nTaste: " + taste;
	}
}

