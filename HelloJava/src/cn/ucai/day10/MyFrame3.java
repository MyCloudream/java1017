package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 使用匿名内部类来解决
 * 在局部内部类中：
 * JDK1.8之前：
 * 只能使用全局变量（属性）或者final修饰的局部变量
 * 对匿名内部类也有效
 * JDK1.8之后，final关键字可以省略，但是final效果还在。
 */
public class MyFrame3 extends JFrame implements ActionListener{
	private JButton btn;
	public MyFrame3(){
		// 定义画布（面板）
		btn = new JButton();
		int a = 2;
		btn.setText("点我");
		// 将按钮显示在窗体上
		setContentPane(btn);
		// 给按钮添加监听（摄像头）
		btn.addActionListener(this);
		// 设置x y 宽度 高度
		setBounds(900, 200, 300, 300);
		setTitle("Java - HellJava/src/ucai/day10/MyFrame.java - Eclipse");
		// 设置默认关闭方式：关闭窗口的时候，结束程序
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void m(){
		this.btn.setText("1");
	}
	
	public static void main(String[] args) {
		MyFrame3 mf = new MyFrame3();
		mf.m();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran = new Random();
		int ni = ran.nextInt(100);
		btn.setText(ni+"");
	}
}
