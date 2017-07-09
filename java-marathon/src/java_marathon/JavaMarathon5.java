package java_marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JavaMarathon5 {

	public static void main(String[] args) {
	
		List<Integer> dishesNum = new ArrayList<>();
		Random rand = new Random();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//ランダムに数字を出してリストに入れる
		for (int i = 0; i < Integer.parseInt(args[0]) ; i++) { //起動時に枚数指定
			Integer dishNum = rand.nextInt(3) + 1; //1~3でランダム出力
			
			switch(dishNum) {
			case 1:
				Dish pastaDish = new PastaDish();
				break;
			case 2:
				Dish doriaDish = new DoriaDish();
				break;
			case 3:
				Dish desertDish = new DesertDish();
				break;
			}
			
			dishesNum.add(dishNum);
		}
		
		
		System.out.println("いまお皿が" + args[0] +"枚あって、こう言う順序で並んでいるんだけど、");
		for (int i = 0; i < dishesNum.size(); i++) {
			if (i == (dishesNum.size() -1)) {
				System.out.println(dishesNum.get(i));
			} else {
				System.out.print(dishesNum.get(i) + ",");
			}
		}
		
		//エンター押させる
		System.out.println("これをお皿の種類ごとに並び替えてくれますか？(エンターを押す)");
		try {
			br.readLine();			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//並べ替えて出力
		Collections.sort(dishesNum);
		for (int i = 0; i < dishesNum.size(); i++) {
			if (i == (dishesNum.size() -1)) {
				System.out.println(dishesNum.get(i));
			} else {
				System.out.print(dishesNum.get(i));
			}
		}
		//エンター押させる
		System.out.println("何枚ありましたか？");
		try {
			br.readLine();			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*
		 * 注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意
		 * 桁数を合わせて出力する
		 * 注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意注意
		 */
		System.out.println("1.パスタ用・・・" + PastaDish.getTotalDishes() + "枚");
		System.out.println("2.ドリア用・・・" + DoriaDish.getTotalDishes() + "枚");
		System.out.println("3.デザート用・・・" + DesertDish.getTotalDishes() + "枚");
		
		//エンター押させる
		System.out.println("それでは、一枚ずつ洗ってください");
			try {
					br.readLine();			
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		
		//一枚ずつ洗う
			System.out.println("皿の枚数：" + dishesNum.size());
			
		for (int i = 0; i < dishesNum.size();) {
			if (i == (dishesNum.size() -1)) {
				for (int j = 0; j < dishesNum.size(); j++) {
					if (j == (dishesNum.size() -1)) {
						System.out.println(dishesNum.get(j));
					} else {
						System.out.print(dishesNum.get(j));
					}
				}
				dishesNum.remove(0); // 先頭を消していく
			} else {
				for (int j = 0; j < dishesNum.size(); j++) {
					if (j == (dishesNum.size() -1)) {
						System.out.println(dishesNum.get(j));
					} else {
						System.out.print(dishesNum.get(j));
					}
				}
				dishesNum.remove(0); // 先頭を消していく
			}
		}
		
		System.out.println("おおー、早い！よくできました！");
	}
}
