package cn.ucai.day13.homework;

import java.util.Scanner;
/**
 * ģ���û�ע�����
 */
public class UserRegist {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		for(;;){
			System.out.println("�������û�������");
			String name = scan.next();
			if(name.matches("[a-zA-Z0-9_]{5,8}")){
				user.setName(name);
				break;
			}else{
				System.out.println("�û�����ʽ����");
			}
		}
		for(;;){// ����ظ������������Ҳ������¼�벻�ȣ�����ҲҪ�������롣
			String password = "";
			for(;;){
				System.out.println("�������û����룺");
				password = scan.next();
				if(password.matches("[a-zA-Z0-9_]{6,8}")){
					// ������ظ����붼ȷ�Ϻ��ٴ洢
					break;
				}else{
					System.out.println("�����ʽ����");
				}
			}
			String repassword = "";
			for(;;){// �ظ������ʽ���ԣ�����¼���ظ�����
				System.out.println("���ظ��û����룺");
				repassword = scan.next();
				if(repassword.matches("[a-zA-Z0-9_]{6,8}")){
					break;
				}else{
					System.out.println("�ظ������ʽ����");
				}
			}
			if(password.equals(repassword)){
				// ������ظ����붼ȷ�Ϻ��ٴ洢
				user.setPassword(password);
				break;
			}else{
				System.out.println("����¼�벻һ��");
			}
		}
		
		for(;;){
			System.out.println("�������û����䣺");
			String email = scan.next();
			if(email.matches("[a-zA-Z0-9_]{5,20}@{1}[a-zA-Z0-9]{2,}\\.{1}(com|cn)")){
				user.setEmail(email);
				break;
			}else{
				System.out.println("�����ʽ����");
			}
		}
		System.out.println(user);
		scan.close();
	}
}