package cn.ucai.day26;

import java.util.Arrays;
import java.util.List;

/**
 * 一维数组和集合的相互转换
 */
public class TestArray {
	public static void main(String[] args) {
		/*String[] strArr = {"one","two","three","four","five"};
		// 把strArr转为List集合
		List<String> list = Arrays.asList(strArr);

		// 将list转为指定类型的数组
		String[] strArr2 = list.toArray(new String[]{});
		for(String s : strArr2){
			System.out.println(s);
		}*/
		
		
		Integer[] niArr = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(niArr);
	}
}
