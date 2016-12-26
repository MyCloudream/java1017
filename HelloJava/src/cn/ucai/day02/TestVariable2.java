package cn.ucai.day02;

/**
 * ctrl + alt + 上/下：复制光标所在行到上/下一行
 */
public class TestVariable2 {
	public static void main(String[] args) {
		System.out.println((Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)));
		
		double d1 = Math.sqrt(20);
		double d2 = Math.sqrt(10);
		System.out.println((d1+d2)/(d1-d2));
		double d3 = d1 + d2;
		double d4 = d1 - d2;
		System.out.println(d3/d4);
	}
}
