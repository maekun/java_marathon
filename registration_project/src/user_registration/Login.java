package user_registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Login {

	private static UserAccount selectedAccount;

	static void idChecker(Map<String,UserAccount> accounts) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			try {
				System.out.println("ログインページ" + "\n");

				while (true) {
					System.out.println("登録情報を入力してください");
					System.out.print("メールアドレス：");
					String inputMailAddress = br.readLine();
					if (accounts.containsKey(inputMailAddress)) {
						selectedAccount = (UserAccount) accounts.get(inputMailAddress);
						break;
					} else {
						System.out.println("そのアドレスは登録されていません");
						continue;
					}
				}

				System.out.print("パスワード：");
				String inputPassWord = br.readLine();

				if (selectedAccount.getPassWord().equals(inputPassWord)) {
					System.out.println("ログイン成功\nいらっしゃいませ、" + selectedAccount.getName() + "さん");
					selectedAccount.setLoginStatus(true);
					break;
				} else {
					System.out.println("ご登録情報照会に失敗しました");
					continue;
				}

			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("ご登録情報照会に失敗しました");
				continue;
			}
		}

	}

}
