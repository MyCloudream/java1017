package cn.ucai.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 初始化方式：
 * 1、默认初始化
 * 2、静态初始化
 * 3、动态初始化
 * 
 * 用一个方法能够完成所有类型的一维数组到一维集合的转换，如何来做？
 * 泛型：
 * 1、泛型类
 * 2、泛型方法
 * 3、泛型接口
 */
public class TestArray3 {
	public static void main(String[] args) {
		Integer[][] niArr = {
				{1,2,3,4,5,6},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6}
		};
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		for(int i=0;i<niArr.length;i++){
			List<Integer> list2 = array2List(niArr[i]);
			list.add(list2);
		}
		
		System.out.println(list);
	}
	
	/**
	 * 完成一维数组到一维集合的转换
	 */
	public static List<Integer> array2List(Integer[] strArr){
		List<Integer> list = Arrays.asList(strArr);
		return list;
	}
	
	/**
	 * 完成一维数组到一维集合的转换
	 */
	public static List<String> array2List(String[] strArr){
		List<String> list = Arrays.asList(strArr);
		return list;
	}
}
