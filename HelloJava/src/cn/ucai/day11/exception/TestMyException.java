package cn.ucai.day11.exception;

/**
 * 自定义异常：
 * 1、定义一个异常类：继承自Exception或其子类,也可以继承自RuntimeException
 * 2、提供一个String做参数的构造方法
 * 
 * 自定义异常的使用：
 * 通过throw + 自定义异常的对象，向外抛出。
 */
public class TestMyException {
	public static void main(String[] args) {
		try {
			String str = getUser("张三");
			System.out.println("找到了");
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	// 想从数组中查找张三的同学，如果找的到，则返回该同学的信息，如果找不到，则返回null。
	public static String getUser(String name) throws MyException{
		String[] strArr = {"张飞","李四","王五"};
		for(int i=0;i<strArr.length;i++){
			if(strArr[i].equals(name)){
				return strArr[i];
			}
		}
		throw new MyException("找不到");// 将方法结束
//		return null;
	}
}

class MyException extends Exception{
	public MyException(){}
	
	public MyException(String msg){
		super(msg);
	}
}
