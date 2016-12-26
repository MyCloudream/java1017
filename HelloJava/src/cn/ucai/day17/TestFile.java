package cn.ucai.day17;

/**
 * 递归：是一种方法内部调用方法本身的编程技巧。 
 * 计算5! = 5*4*3*2*1
 * 5的阶乘：
 * 5！ = 4！ * 5
 * 4！ = 3！ * 4
 * 3！ = 2！ * 3
 * 2! = 1! * 2
 * 1! = 1;
 * 
 * 阶乘要有下限。
 * 
 * 菲波那契数列：1 1 2 3 5 8 13 21 34 55 
 * f(n) = f(n-1) + f(n-2);
 * f(10) = f(9) + f(8);
 */
public class TestFile {
	public static void main(String[] args) {
		int s = m(5);
		System.out.println(s);
	}
	
	/**
	 * 计算n的阶乘
	 */
	public static int m(int n){
		if(n==1){
			return 1;
		}
		return m(n-1)*n;
	}
}
