package PizzaBillGenerator;

public class Pizza {
	
	private boolean veg;
	private int price;
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int takeAway = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
	
	public Pizza(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 500;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingsPrice;
	}
	
	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += takeAway;
	}
	
	public void getBill() {
		String bill= "";
		System.out.println("Pizza:" +basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill += "Extra cheese added:" +extraCheesePrice+ "\n";
		}
		if(isExtraToppingsAdded) {
			bill += "Extra toppings added:" +extraToppingsPrice+ "\n";
		}
		if(isOptedForTakeAway) {
			bill += "Take away charges:" +takeAway+ "\n";
		}
		bill += "Bill:" +this.price;
		System.out.println(bill);
	}
}
