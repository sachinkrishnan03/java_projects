package PizzaBillGenerator;

public class Main {
	public static void main(String args[]) {
		Pizza vegPizza = new Pizza(true);
		vegPizza.addExtraCheese();
		vegPizza.addExtraToppings();
		vegPizza.takeAway();
		vegPizza.getBill();
		
		DeluxePizza dp = new DeluxePizza(false);
		dp.getBill();
	}
}
