package cn.ucai.day11.exception;

/**
 * try-catch-finally用法：
 * 1、try出现一次，放置可能会发生异常的代码
 * 2、catch可以出现多次，如果catch中的两个异常平级或者毫无关系，则catch的顺序无所谓。
 * 如果catch中的两个异常存在父子关系，则需要把子类的放上面，父类的放下面。
 * 3、finally：表示一定(无论如何都)会执行的代码，一般做资源的关闭或临时文件的处理用。
 * 4、try、catch、finally都不能单独使用 catch出现0-n次,try出现1次，finally出现0-1次
 * 
 * 数据库操作：
 * 1、数据库连接 2、操作数据 3、关闭连接
 */
public class TestTry4 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}
	
	public static int getInt(){
		try{
			int a = 2;
			int b = 1;
			System.out.println(a/b);
			return 1;
		}catch(ArithmeticException e){
			System.out.println("算术运算异常");
			return 2;
		}finally{
			System.out.println("finally");
			return 3;
		}
	}
}
