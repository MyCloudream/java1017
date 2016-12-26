package cn.ucai.day19.thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
		JButton btn = new JButton("点我");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyThread mt = new MyThread();
				Thread th = new Thread(mt);
				th.start();
			}
		});
		
		setContentPane(btn);
		setTitle("线程案例");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	
	/**
	 * 重写：
	 * 1、发生在父子类中
	 * 2、同名同参同返回
	 * 3、子类抛出的异常，不能比父类（父接口）更宽泛。
	 * 4、子类的修饰符不能比父类更封闭
	 */
	private class MyThread implements Runnable{
		@Override
		public void run(){
			System.out.println("加载新闻开始....");
			try {
				// 模拟请求和响应中的耗时
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("加载新闻结束");
		}
	}
}
