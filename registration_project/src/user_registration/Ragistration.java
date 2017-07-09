package user_registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ragistration {
	
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//メアドとアカウントを紐づける為のハッシュマップ
		Map<String,UserAccount> accounts = new HashMap<>();
		
		//人数分のアカウントを作成
		for (int i = 0; i < args.length; i++) {
			UserAccount userAccount = new UserAccount(args[i]);
			accounts.put(userAccount.getMailAddress(),userAccount);	//メアドとアカウントを紐づける
		}
		
		
		
		while(true) {
			System.out.println("ログインページに移動しますか？");
			System.out.println("1.Yes\n2.No");
			try {
				int selectedNum = Integer.parseInt(br.readLine());
				if(selectedNum == 1) {
				
					Login.idChecker(accounts); //アカウントが詰まったHashMapごと投げる
					break;
					
				}else if(selectedNum == 2){
					System.out.println("プログラムを終了します");
					break;
				}else {
					throw new Exception();
				}
				
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("入力内容が不適切です");
				continue;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("入力内容が不適切です");
				continue;
			}
			
			
		}
		
		
	}	
	
}
