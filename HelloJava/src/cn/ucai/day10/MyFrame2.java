package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ʹ�������ڲ��������
 * �ھֲ��ڲ����У�
 * JDK1.8֮ǰ��
 * ֻ��ʹ��ȫ�ֱ��������ԣ�����final���εľֲ�����
 * �������ڲ���Ҳ��Ч
 * JDK1.8֮��final�ؼ��ֿ���ʡ�ԣ�����finalЧ�����ڡ�
 */
public class MyFrame2 extends JFrame{
	public MyFrame2(){
		// ���廭������壩
		/*final */JButton btn = new JButton();
		int a = 2;
		btn.setText("����");
		// ����ť��ʾ�ڴ�����
		setContentPane(btn);
		// ����ť��Ӽ���������ͷ��
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Random ran = new Random();
				int ni = ran.nextInt(100);
				btn.setText(ni+"");
//				System.out.println(a);
			}
		});
		// ����x y ��� �߶�
		setBounds(900, 200, 300, 300);
		setTitle("Java - HellJava/src/ucai/day10/MyFrame.java - Eclipse");
		// ����Ĭ�Ϲرշ�ʽ���رմ��ڵ�ʱ�򣬽�������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame2();
	}
}
