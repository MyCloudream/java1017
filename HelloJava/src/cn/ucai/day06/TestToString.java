package cn.ucai.day06;

/**
 * 一个类中的多个方法之间：
 * 方法同名不同参，称为方法的重载。
 * 返回值类型没有要求
 */
public class TestToString {
	public static void main(String[] args) {
		int[] niArr = {3,1,5,2,4};
		toString(niArr);
		String[] strArr = {"张三","李四","王五","张三","李四","王五"};
		toString(strArr);
	}
	
	/**
	 * 将任意String类型一维数组格式化输出
	 */
	public static void toString(String[] strArr){
		System.out.print("[");
		for(int i=0;i<strArr.length;i++){
			if(i==strArr.length-1){
				System.out.print(strArr[i]);
			}else{
				System.out.print(strArr[i]+", ");
			}
		}
		System.out.println("]");
	}
	
	/**
	 * 将任意int类型一维数组格式化输出
	 */
	public static void toString(int[] niArr){
		System.out.print("[");
		for(int i=0;i<niArr.length;i++){
			if(i==niArr.length-1){
				System.out.print(niArr[i]);
			}else{
				System.out.print(niArr[i]+", ");
			}
		}
		System.out.println("]");
	}
}
