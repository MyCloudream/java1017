package cn.ucai.day04;

import java.util.Random;

/**
 * ctrl + shift + o : 
 */
public class TestRandom {
	public static void main(String[] args) {
		Random ran = new Random();
		// [0-100)
		for(;;){
			int n = ran.nextInt(100)+1;
			System.out.println(n);
		}
	}
}
