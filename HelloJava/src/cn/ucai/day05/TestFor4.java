package cn.ucai.day05;

public class TestFor4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 14; j++) {
				if (i * 10 + j * 4 + (16 - i - j) / 2 == 55) {
					System.out.println("´óÅ£Ô³£º" + i);
					System.out.println("ÆÕÍ¨Ô³£º" + j);
					System.out.println("²ËÄñÔ³£º" + (16 - i - j));
				}
			}
		}
	}
}
