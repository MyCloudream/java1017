package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private JButton btn;
	public MyFrame(){
		// ���廭������壩
		btn = new JButton();
		btn.setText("����");
		// ����ť��ʾ�ڴ�����
		setContentPane(btn);
		// ����ť��Ӽ���������ͷ��
		btn.addActionListener(new MyListener());
		// ����x y ��� �߶�
		setBounds(900, 200, 300, 300);
		setTitle("Java - HellJava/src/ucai/day10/MyFrame.java - Eclipse");
		// ����Ĭ�Ϲرշ�ʽ���رմ��ڵ�ʱ�򣬽�������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	
	// ��Ա�ڲ���
	public class MyListener implements ActionListener{
		// �����ť�����Զ���ִ�и÷���
		@Override
		public void actionPerformed(ActionEvent e) {
			Random ran = new Random();
			int ni = ran.nextInt(100);
			btn.setText(ni+"");
		}
	}
}
