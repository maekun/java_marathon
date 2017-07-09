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
				System.out.println("���O�C���y�[�W" + "\n");

				while (true) {
					System.out.println("�o�^������͂��Ă�������");
					System.out.print("���[���A�h���X�F");
					String inputMailAddress = br.readLine();
					if (accounts.containsKey(inputMailAddress)) {
						selectedAccount = (UserAccount) accounts.get(inputMailAddress);
						break;
					} else {
						System.out.println("���̃A�h���X�͓o�^����Ă��܂���");
						continue;
					}
				}

				System.out.print("�p�X���[�h�F");
				String inputPassWord = br.readLine();

				if (selectedAccount.getPassWord().equals(inputPassWord)) {
					System.out.println("���O�C������\n��������Ⴂ�܂��A" + selectedAccount.getName() + "����");
					selectedAccount.setLoginStatus(true);
					break;
				} else {
					System.out.println("���o�^���Ɖ�Ɏ��s���܂���");
					continue;
				}

			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("���o�^���Ɖ�Ɏ��s���܂���");
				continue;
			}
		}

	}

}
