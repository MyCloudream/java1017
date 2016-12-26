package cn.ucai.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 初始化方式：
 * 1、默认初始化
 * 2、静态初始化
 * 3、动态初始化
 */
public class TestArray2 {
	public static void main(String[] args) {
		String[][] strArr = {
				{"one","two","three","four","five"},
				{"one","two","three","four","five"},
				{"one","two","three","four","five"}
		};
		
		List<List<String>> list = new ArrayList<List<String>>();
		
		for(int i=0;i<strArr.length;i++){
			List<String> list2 = array2List(strArr[i]);
			list.add(list2);
		}
		
		System.out.println(list);
	}
	
	/**
	 * 完成一维数组到一维集合的转换
	 */
	public static List<String> array2List(String[] strArr){
		List<String> list = Arrays.asList(strArr);
		return list;
	}
}
