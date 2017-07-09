package user_registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


/**
 * @author hiroki.mae
 *
 */
/**
 * @author hiroki.mae
 *
 */
/**
 * @author hiroki.mae
 *
 */
public class UserAccount {
	
	Random rand = new Random();

	/**ユーザー名*/
	private String name;
	/**ユーザーID*/
	private int id;
	/**パスワード*/
	private String passWord;
	/**登録メールアドレス*/
	private String mailAddress;
	private boolean loginStatus = false ;
	
	
	/**
	 * アカウント作成コンストラクタ.<br>
	 * プログラム起動時に受け取った名前を受け取る
	 * @param name　
	 * 
	 */
	public UserAccount(String name) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while(true) {
			try {
				//idが決定
				id = rand.nextInt(89000000) + 10000000; //ランダムid生成
				System.out.println("あなたのID:" + id +"\n");
				
				//ユーザー名が決定
				System.out.println( name + " さんのユーザー登録を行います");
				System.out.println("ユーザー名を決めてください");
				this.name = br.readLine();
				
				//メールアドレスが決定
				System.out.println("メールアドレスを入力してください");
				this.mailAddress = br.readLine();
				
				while(true) {
					try {
						//ログインパスワードを決めてもらう
						System.out.println("8文字以上、16文字以内でパスワードを決めてください");
						String inputStr = br.readLine();
						if(inputStr.length() >= 8) {
							this.passWord = inputStr;
							break;
						}else if(inputStr.length() > 8){
							System.out.println("パスワードが短すぎます");
							continue;
						}else if(inputStr.length() > 16) {
							System.out.println("パスワードが長すぎます");
							continue;
						}else {
							throw new Exception();
						}		
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("入力内容が不適切です");
						continue;
						
					}
				}
				
				break;
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("入力内容が不適切です");
				continue;
				
			}finally {
				System.out.println("登録が完了しました");
			}
		}
	}
	
	
	/*
	 * 登録情報を開示する
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.name + "(" + this.id + ")\nメールアドレス:" + this.mailAddress +"\nパスワード：********\nログイン状態：" + this.loginStatus;
	}


	/**
	 * field変数のゲッターセッター
	 * @return
	 */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMailAddress() {
		return mailAddress;
	}


	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public boolean isLoginStatus() {
		return loginStatus;
	}


	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
}
