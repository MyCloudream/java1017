package cn.ucai.day05;

public class TestFor4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 14; j++) {
				if (i * 10 + j * 4 + (16 - i - j) / 2 == 55) {
					System.out.println("��ţԳ��" + i);
					System.out.println("��ͨԳ��" + j);
					System.out.println("����Գ��" + (16 - i - j));
				}
			}
		}
	}
}
