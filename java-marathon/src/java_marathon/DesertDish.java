package java_marathon;

public class DesertDish extends Dish {

private static int totalDishes = 0;
	
	
	public DesertDish() {
		// TODO Auto-generated constructor stub
		this.setName("デザート用");
		DesertDish.totalDishes++;
	}


	
	
	/**
	 * setter/getter
	 * @return
	 */
	public static int getTotalDishes() {
		return totalDishes;
	}


	public static void setTotalDishes(int totalDishes) {
		DesertDish.totalDishes = totalDishes;
	}

}
