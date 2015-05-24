package FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Prepareing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding asuce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("    " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("----" + name + "----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping);
		}
		return display.toString();
	}
}