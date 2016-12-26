package cn.ucai.day05;

/**
 * 数组定义好之后，数组元素有默认初始化
 * 各种数据类型的默认值：
 * 1、byte、short、int、long数组：不同位数的0
 * 2、float、double：不同位数的0.0
 * 3、boolean：false
 * 4、char：'\u0000'
 * 
 * 对于引用数据类型来说，为null
 * 
 */
public class TestArray2 {
	public static void main(String[] args) {
		String[] strArrNames = {"张三","李四","王五"};
		for(int i=0;i<strArrNames.length;i++){
			System.out.println(strArrNames[i]);
		}
		System.out.println(strArrNames[1]);
		
		/*int scoreArr2[] = new int[7];
		
		// 数组的定义
		int[] scoreArr = new int[7];
		System.out.println(scoreArr[0]);
		System.out.println(scoreArr[1]);
		System.out.println(scoreArr[5]);
		
		boolean[] boolArr = new boolean[10];
		System.out.println(boolArr[3]);
		
		char ch = '\u4E2D';
		System.out.println(ch);

		String[] strArr = new String[10];
		System.out.println(strArr[4]);*/
	}
}
