package cn.ucai.day07.pa3;

import java.util.Random;

/**
 * ��һ������Ϊnullʱ�����ʹ�ö���.�����øö��������
 * �򷽷�����ᱨNullPointerException����ָ���쳣��
 * 
 * {"��������","��ϫ����","������־","����֮ŭ"}
 * 1-5��
 * 100 - 500
 */
public class TestOrc {
	public static void main(String[] args) {
		Orc[] orcArr = new Orc[20];
		Random ran = new Random();
		String[] strNames = {"��������","��ϫ����","������־","����֮ŭ"};
		for(int i=0;i<orcArr.length;i++){
			orcArr[i] = new Orc();
			int nameIndex = ran.nextInt(4);
			orcArr[i].name = strNames[nameIndex];
			int ranLv = ran.nextInt(5)+1;
			orcArr[i].lv = ranLv;
			orcArr[i].hp = ranLv*100;
			
			orcArr[i].desc();
		}
		
//		String s = null;
//		System.out.println(s.charAt(0));
	}
}
