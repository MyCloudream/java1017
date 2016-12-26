package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private JButton btn;
	public MyFrame(){
		// 定义画布（面板）
		btn = new JButton();
		btn.setText("点我");
		// 将按钮显示在窗体上
		setContentPane(btn);
		// 给按钮添加监听（摄像头）
		btn.addActionListener(new MyListener());
		// 设置x y 宽度 高度
		setBounds(900, 200, 300, 300);
		setTitle("Java - HellJava/src/ucai/day10/MyFrame.java - Eclipse");
		// 设置默认关闭方式：关闭窗口的时候，结束程序
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	
	// 成员内部类
	public class MyListener implements ActionListener{
		// 点击按钮，（自动）执行该方法
		@Override
		public void actionPerformed(ActionEvent e) {
			Random ran = new Random();
			int ni = ran.nextInt(100);
			btn.setText(ni+"");
		}
	}
}
