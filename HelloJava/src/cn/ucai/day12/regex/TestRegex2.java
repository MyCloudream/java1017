package cn.ucai.day12.regex;

import java.util.Arrays;

/**
 * ������ʽ:һ�������ݵ�У��
 * \\d ��ʾ����
 * +�ñ�ʾ�������1�����
 */
public class TestRegex2 {
	public static void main(String[] args) {
		/*String str = "abc123def1223mon12233jkl11223qwe";
		String[] strArr = str.split("1{1,}2{1,}");
		System.out.println(Arrays.toString(strArr));*/
		
		/*// �û��� ��ֻ����������ĸ�»������ ���ҳ���Ϊ8-12λ�����ֲ�������ͷ
		String name = "zhangsan1";
//		if(name.matches("[a-zA-Z_0-9]{8,12}")){
		if(name.matches("[a-zA-Z]{1}\\w{7,11}")){
			System.out.println("���ǺϷ����û���");
		}else{
			System.out.println("�û������Ϸ�");
		}
		
		// �ֻ�������֤��Ҫ�����������ɣ�����ʹ��1��ͷ���ڶ�λ��3578������ȫ���֡�
		String phone = "12911010011";
		if(phone.matches("1{1}[3578]{1}[0-9]{9}")){
			System.out.println("���ǺϷ����ֻ���");
		}else{
			System.out.println("�ֻ����벻�Ϸ�");
		}*/
		
		// ����  ��������ĸ�»��������������6-20λ   @ ������ĸ2λ���� . com����cn
		String email = "chenjun@ucai.com";
		if(email.matches("\\w{6,20}@{1}[a-zA-Z0-9]{2,}\\.{1}(com|cn)")){
			System.out.println("���ǺϷ���email");
		}else{
			System.out.println("email���Ϸ�");
		}
	}
}
