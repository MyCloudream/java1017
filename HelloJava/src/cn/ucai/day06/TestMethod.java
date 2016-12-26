package cn.ucai.day06;

/**
 	输出3遍Hello
	输出5遍World
	输出3遍Hello
	输出3遍World
	输出6遍Hello
	输出5遍World
	
	alt + shift + r : 一次性更改某一变量名或方法名的所有名称。
 */
public class TestMethod {
	public static void main(String[] args) {
		// 方法的使用
		print(3,"Hello");// 实际参数
		print(5,"World");
		print(3,"Hello");
		print(3,"World");
		print(6,"Hello");
		print(5,"World");
	}
	
	// 方法的定义
	public static void print(int n,String s){// 形式参数
		for(int i = 0;i < n ;i ++){
			System.out.println(s);
		}
	}
}
