package cn.ucai.day04;

/**
 * ��ӡ1��100��������������7�ı����ʹ�7��
 */
public class Test08 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%7==0 || i%10==7 || i/10==7){
				continue;
			}
			System.out.print(i+",");
		}
	}
}
