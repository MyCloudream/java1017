package cn.ucai.day19.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer:定时器
 */
public class TestTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();
		// 延迟1秒之后，每3秒执行一次任务
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		},1000,3000);
	}
}
