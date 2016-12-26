package cn.ucai.day02;

/**
 * ctrl + alt + 上/下：复制光标所在行到上/下一行
 * ctrl + shift + f :代码格式化
 */
public class TestVariable3 {
	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		
	}
}
