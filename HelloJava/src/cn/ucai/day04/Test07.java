package cn.ucai.day04;

public class Test07 {
	public static void main(String[] args) {
		int i = 1;
		do{
			if (i <= 20) {
				System.out.println("�����Գ�" + i + "��");
			} else if (i < 100) {
				System.out.println("������꣬�����Գ�" + i + "��");
			} else {
				System.out.println("������");
			}
			i++;
		}while(i <= 100);
		
		int j = 1;
		do{
			if (j <= 20) {
				System.out.println("�����Գ�" + j + "��");
			} else if (j < 100) {
				System.out.println("������꣬�����Գ�" + j + "��");
			} else if (j == 100) {
				System.out.println("������");
				break;
			}
			j++;
		}while(true);
	}
}
