package AbstractFactory;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("----" + name + "----\n");
		if (dough != null) 
			display.append(dough + "\n");
		if (sauce != null)
			display.append(sauce + "\n");
		if (veggies != null) {
			for (Veggies veggie : veggies ) 
				display.append(veggie + "  ");
			display.append("\n");
		}
		if (cheese != null)
			display.append(cheese + "\n");
		if (pepperoni != null)
			display.append(pepperoni + "\n");
		if (clam != null)
			display.append(clam + "\n");
		return display.toString();
	}
}
