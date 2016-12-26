package cn.ucai.day06;

/**
 * 完成任意两个int类型数据的相加
 * 
 * 方法的返回值和返回值类型要一致
 * 如果一个方法没有返回值，则写成void
 */
public class TestMethod3 {
	public static void main(String[] args) {
		int n = add(2, 3);
	}
	
	public static int add(int a,int b){
		int c = a + b;
		return c;// 将c返回
	}
	
	
	public static void print(){
		System.out.println("Hello ");
		return ;
	}
	
}
