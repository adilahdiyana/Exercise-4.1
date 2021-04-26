package Exercise4_1;

public class Main {

	public static void main(String[] args) {
		
		Fruit objFruits= new Fruit("Orange");
		System.out.println(objFruits);
		System.out.println();
		
		Apple objApple= new Apple("Apple", 3.50, 5);
		System.out.println(objApple);
		System.out.println();
		
		GreenApple objGreenApple= new GreenApple("Green Apple", 2.90, 2, 0.32, "sour");
		System.out.println(objGreenApple);
		System.out.println();
		
		RedApple objRedApple= new RedApple("Red Apple", 4.10, 6, 0.95, "sweet" );
		System.out.println(objRedApple);
		System.out.println();
		
		Manggo objManggo= new Manggo("Manggo", 5.00, 4, "India");
		System.out.println(objManggo);
		System.out.println();
		
		Strawberry objStrawberry= new Strawberry("Strawberry", 2.50, 2, 65.0);
		System.out.println(objStrawberry);
		System.out.println();
		
	}
}
	
