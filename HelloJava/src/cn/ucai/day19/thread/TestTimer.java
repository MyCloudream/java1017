package cn.ucai.day19.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer:��ʱ��
 */
public class TestTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();
		// �ӳ�1��֮��ÿ3��ִ��һ������
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		},1000,3000);
	}
}
