package cn.ucai.day06;

import java.util.Scanner;

/**
 * �������ά����Ķ�̬��ʼ����
 * 1�������ά���飬һά���Ȳ�ָ��
 * 2���ֱ�ָ��ÿһ��һά����ĳ���
 * 3����ɳ�ʼ��
 */
public class TestArray5 {
	public static void main(String[] args) {
		String[] strArrNames = {"��������","��ϫ����","������־","����֮ŭ"};

		// ��ɫ���ԣ�Ѫ�� ��ͨ���� ħ������ ����
		int[][] niArrRoleAttr = {
			{100,7,2,3},
			{120,6,7,4},
			{90,7,5,4},
			{150,7,4,7}
		};

		// ��ɫ�����б�
		String[][] strArrSkills = {
			{"��˪���","ȫ���ע","����뷢","ӥ������","ħ��ˮ����"},
			{"������ʿ","�������","��ʯ�����","���龫��","����ǿϮ"},
			{"��ŷ�����ȳ�","���г��","������̬","������","�������"},
			{"�籩�ľ���","��������","��Ұŭ��","��������","����ŭצ"}
		};
		
		String[] strArrSkillOrder = {"һ","��","��","��","��"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ����ɫ������");
		String name = scan.next();
		for(int i = 0;i<strArrNames.length;i++){
			if(strArrNames[i].equals(name)){
				System.out.println(name+"��Ѫ��Ϊ��"+niArrRoleAttr[i][0]);
				System.out.println(name+"���չ�Ϊ��"+niArrRoleAttr[i][1]);
				System.out.println(name+"��ħ��Ϊ��"+niArrRoleAttr[i][2]);
				System.out.println(name+"�ķ���Ϊ��"+niArrRoleAttr[i][3]);
				
				for(int j=0;j<strArrSkills[i].length;j++){
					System.out.println(name+"�ĵ�"+strArrSkillOrder[j]+"������Ϊ��"+strArrSkills[i][j]);
				}
//				System.out.println(name+"�ĵڶ�������Ϊ��"+strArrSkills[i][1]);
//				System.out.println(name+"�ĵ���������Ϊ��"+strArrSkills[i][2]);
//				System.out.println(name+"�ĵ��ĸ�����Ϊ��"+strArrSkills[i][3]);
//				System.out.println(name+"�ĵ��������Ϊ��"+strArrSkills[i][4]);
			}
		}
	}
}
