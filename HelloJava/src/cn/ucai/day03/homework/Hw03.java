package cn.ucai.day03.homework;

/**
 * 编写程序，计算3712秒是几小时、几分、几秒。如7199秒对应时间为1小时59分59秒。
 */
public class Hw03 {
	public static void main(String[] args) {
		int seconds = 7199;
		int hour = seconds / 3600;
		// int minute = seconds/60%60;
		int minute = seconds % 3600 / 60;
		int second = seconds % 60;
		System.out.println(seconds + "秒对应时间为" + hour + "小时" + minute + "分" + second + "秒。");
	}
}
