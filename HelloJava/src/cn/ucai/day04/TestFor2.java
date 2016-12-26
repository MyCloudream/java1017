package cn.ucai.day04;

/**
 * 变量，都是有作用范围的：
 * 1、变量的作用范围就是它所在的{}
 * 2、有一些特殊的情况：比如for
 */
public class TestFor2 {
	public static void main(String[] args) {
		{
			int i = 2;
		}
		
		{
			int i = 3;
		}
		
		{
			int i = 2;
		}
		
	}
}
