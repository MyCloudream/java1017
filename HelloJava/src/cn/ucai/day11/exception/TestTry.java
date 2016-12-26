package cn.ucai.day11.exception;

/**
 * try-catch-finally
 */
public class TestTry {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		// 1、生成了一个异常对象 new ArithmeticException();
		// 2、将异常对象抛出,抛出给程序的调用者：虚拟机
		// 3、虚拟机结束程序，并在控制台打印异常信息
		System.out.println(a/b);
		
		/*try{// 可能会抛出异常的代码
			int a = 2;
			int b = 1;
			System.out.println(a/b);// 1、生成了一个异常对象 new ArithmeticException(); 相当于实际参数
		}catch(ArithmeticException e){// 抓住异常  形式参数
			System.out.println("除数不能为0");
			System.out.println(e.toString());
		}
		System.out.println("else");*/
	}
}
