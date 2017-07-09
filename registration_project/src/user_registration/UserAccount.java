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

	/**���[�U�[��*/
	private String name;
	/**���[�U�[ID*/
	private int id;
	/**�p�X���[�h*/
	private String passWord;
	/**�o�^���[���A�h���X*/
	private String mailAddress;
	private boolean loginStatus = false ;
	
	
	/**
	 * �A�J�E���g�쐬�R���X�g���N�^.<br>
	 * �v���O�����N�����Ɏ󂯎�������O���󂯎��
	 * @param name�@
	 * 
	 */
	public UserAccount(String name) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while(true) {
			try {
				//id������
				id = rand.nextInt(89000000) + 10000000; //�����_��id����
				System.out.println("���Ȃ���ID:" + id +"\n");
				
				//���[�U�[��������
				System.out.println( name + " ����̃��[�U�[�o�^���s���܂�");
				System.out.println("���[�U�[�������߂Ă�������");
				this.name = br.readLine();
				
				//���[���A�h���X������
				System.out.println("���[���A�h���X����͂��Ă�������");
				this.mailAddress = br.readLine();
				
				while(true) {
					try {
						//���O�C���p�X���[�h�����߂Ă��炤
						System.out.println("8�����ȏ�A16�����ȓ��Ńp�X���[�h�����߂Ă�������");
						String inputStr = br.readLine();
						if(inputStr.length() >= 8) {
							this.passWord = inputStr;
							break;
						}else if(inputStr.length() > 8){
							System.out.println("�p�X���[�h���Z�����܂�");
							continue;
						}else if(inputStr.length() > 16) {
							System.out.println("�p�X���[�h���������܂�");
							continue;
						}else {
							throw new Exception();
						}		
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("���͓��e���s�K�؂ł�");
						continue;
						
					}
				}
				
				break;
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("���͓��e���s�K�؂ł�");
				continue;
				
			}finally {
				System.out.println("�o�^���������܂���");
			}
		}
	}
	
	
	/*
	 * �o�^�����J������
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.name + "(" + this.id + ")\n���[���A�h���X:" + this.mailAddress +"\n�p�X���[�h�F********\n���O�C����ԁF" + this.loginStatus;
	}


	/**
	 * field�ϐ��̃Q�b�^�[�Z�b�^�[
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
