package java_marathon;

public class PastaDish extends Dish{

	private static int totalDishes = 0;
	
	
	public PastaDish() {
		// TODO Auto-generated constructor stub
		this.setName("パスタ用");
		PastaDish.totalDishes++;
	}


	
	
	/**
	 * setter/getter
	 * @return
	 */
	public static int getTotalDishes() {
		return totalDishes;
	}


	public static void setTotalDishes(int totalDishes) {
		PastaDish.totalDishes = totalDishes;
	}
	
}
