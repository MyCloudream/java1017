package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran = new Random();
		int ni = ran.nextInt(100);
		System.out.println("Hello World !");
//		btn.setText(ni+"");
	}

}
