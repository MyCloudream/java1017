package cn.ucai.day03.homework;

/**
 * ��д���򣬼���3712���Ǽ�Сʱ�����֡����롣��7199���Ӧʱ��Ϊ1Сʱ59��59�롣
 */
public class Hw03 {
	public static void main(String[] args) {
		int seconds = 7199;
		int hour = seconds / 3600;
		// int minute = seconds/60%60;
		int minute = seconds % 3600 / 60;
		int second = seconds % 60;
		System.out.println(seconds + "���Ӧʱ��Ϊ" + hour + "Сʱ" + minute + "��" + second + "�롣");
	}
}
