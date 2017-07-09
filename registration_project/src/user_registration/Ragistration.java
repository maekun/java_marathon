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
		
		//���A�h�ƃA�J�E���g��R�Â���ׂ̃n�b�V���}�b�v
		Map<String,UserAccount> accounts = new HashMap<>();
		
		//�l�����̃A�J�E���g���쐬
		for (int i = 0; i < args.length; i++) {
			UserAccount userAccount = new UserAccount(args[i]);
			accounts.put(userAccount.getMailAddress(),userAccount);	//���A�h�ƃA�J�E���g��R�Â���
		}
		
		
		
		while(true) {
			System.out.println("���O�C���y�[�W�Ɉړ����܂����H");
			System.out.println("1.Yes\n2.No");
			try {
				int selectedNum = Integer.parseInt(br.readLine());
				if(selectedNum == 1) {
				
					Login.idChecker(accounts); //�A�J�E���g���l�܂���HashMap���Ɠ�����
					break;
					
				}else if(selectedNum == 2){
					System.out.println("�v���O�������I�����܂�");
					break;
				}else {
					throw new Exception();
				}
				
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("���͓��e���s�K�؂ł�");
				continue;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���͓��e���s�K�؂ł�");
				continue;
			}
			
			
		}
		
		
	}	
	
}
