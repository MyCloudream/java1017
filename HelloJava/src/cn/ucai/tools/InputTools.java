package cn.ucai.tools;

import java.util.Scanner;

/**
 * �����û���������� ������������� �������ַ���
 */
public class InputTools {
	private static Scanner scan = new Scanner(System.in);

	/**
	 * �����û�������������͵�����
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
