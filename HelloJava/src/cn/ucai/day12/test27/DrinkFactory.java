package cn.ucai.day12.test27;

public class DrinkFactory {

	public static Drink getDrink(int drinkType) throws DrinkNotFoundException{
		switch (drinkType) {
		case 1:
			return new Coffee();
//			break;
		case 2:
			return new Beer();
		case 3 :
			return new Milk();
		default:
			throw new DrinkNotFoundException("饮料类型找不到");
//			break;
		}
	}
}
