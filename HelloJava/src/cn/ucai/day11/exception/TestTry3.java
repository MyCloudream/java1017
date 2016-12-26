package cn.ucai.day11.exception;

/**
 * e常用方法:
 * 1、toString
 * 2、getMessage
 * 3、e.printStackTrace()
 * 
 * try-catch-finally用法：
 * 1、try出现一次，放置可能会发生异常的代码
 * 2、catch可以出现多次，如果catch中的两个异常平级或者毫无关系，则catch的顺序无所谓。
 * 如果catch中的两个异常存在父子关系，则需要把子类的放上面，父类的放下面。
 * 
 * catch语句块中写什么？
 * 1、如果程序跟用户打交道，则提供相对友好的提示
 * 2、如果说跟其他程序打交道，一般e.printStackTrace()打印信息到控制台或者将异常信息记录到日志中。
 * 3、其他
 */
public class TestTry3 {
	public static void main(String[] args) {
		try{
			int a = 2;
			int b = 1;
			System.out.println(a/b);
			
//			String str = null;
//			System.out.println(str.charAt(0));
			
			String s = "abc";
			System.out.println(Integer.parseInt(s));
		}catch(ArithmeticException e){//RuntimeException e = new NullPointerException();
			System.out.println("算术运算异常");
		}catch(NullPointerException e){
			System.out.println("空指针异常");
		}catch(RuntimeException e){
			System.out.println("运行时异常");
		}
	}
}
