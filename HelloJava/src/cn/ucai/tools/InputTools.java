package cn.ucai.tools;

import java.util.Scanner;

/**
 * 接收用户输入的内容 输入可以是整数 可以是字符串
 */
public class InputTools {
	private static Scanner scan = new Scanner(System.in);

	/**
	 * 接收用户输入的整数类型的数据
	 */
	public static int getInputInt() {
		return new Scanner(System.in).nextInt();
	}

	public static String getInputString() {
		return new Scanner(System.in).nextLine();
	}

	public static char getInputChar(int index) {
		return new Scanner(System.in).next().charAt(index);
	}

	public static Double getInputDouble() {
		return new Scanner(System.in).nextDouble();
	}
}
