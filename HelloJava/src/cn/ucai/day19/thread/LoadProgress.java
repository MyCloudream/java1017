package cn.ucai.day19.thread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class LoadProgress extends JFrame{
	private JProgressBar jpb;
	public LoadProgress(){
		JPanel pnBasic = new JPanel();
		pnBasic.setLayout(new BorderLayout());
		jpb = new JProgressBar(0,100);
		jpb.setBackground(Color.RED);
		jpb.setValue(20);
		jpb.setForeground(Color.GREEN);
		pnBasic.add(jpb,BorderLayout.CENTER);
		
		JButton btn = new JButton("�ύ");
		btn.addActionListener(new MyMonoter());
		pnBasic.add(btn, BorderLayout.EAST);
		
		// ��������������
		setContentPane(pnBasic);
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600,100);
		setVisible(true);
	}
	
	private class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=20;i<=100;i++){
				try {
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				jpb.setValue(i);
			}
		}
	}
	
	// ��ť��������
	private class MyMonoter implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new MyThread().start();
		}
	}
	
	public static void main(String[] args) {
		new LoadProgress();
	}
}
