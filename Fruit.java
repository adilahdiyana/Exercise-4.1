package Exercise4_1;

public class Fruit { // super class
		private String name;
	
		public Fruit (String name) {
			this.name = name;
			System.out.println(name + "constructor is invoked.");
	}

		public String getName() {
			return this.name;
		}

		public String toString() {
			return name + "have many benefits.";
		}
}
