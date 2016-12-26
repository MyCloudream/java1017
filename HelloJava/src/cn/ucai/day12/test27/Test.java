package cn.ucai.day12.test27;

public class Test {
	public static void main(String[] args) {
		try {
			Drink drink = DrinkFactory.getDrink(4);
			// Car car = CarFactory.getCar("bmw");
			drink.taste();
		} catch (DrinkNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
