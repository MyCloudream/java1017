package cn.ucai.day04;

public class Test03 {
	public static void main(String[] args) {
		for(int i=1;i<=35;i++){// i��ʾ��������
			if(i*2+(35-i)*4==94){
				System.out.println(i);// ��������
				System.out.println(35-i);// ���ӵ�����
				break;
			}
		}
	}
}
