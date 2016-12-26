package cn.ucai.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Collection 和 Collections 有什么关系？
 * Collection：是Iterable的子接口，是List和Set的父接口。
 * Collections：是集合相关的工具类，里面包含了一些操作集合的常用方法 
 */
public class TestCollection {
	public static void main(String[] args) {
		// 将数组转为List集合
		String[] strArr = {"zhangsan","lisi","wangwu"};
//		List<String> list = Arrays.asList(strArr);
		List<String> list = Arrays.asList("zhangsan","lisi","wangwu");
		System.out.println(list);
		// List集合转对应类型的数组
		/*List<String> list = new ArrayList<String>();
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");
		String[] strArr = list.toArray(new String[] {});
		System.out.println(Arrays.toString(strArr));*/
	}
}
