package cn.ucai.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��ʼ����ʽ��
 * 1��Ĭ�ϳ�ʼ��
 * 2����̬��ʼ��
 * 3����̬��ʼ��
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
	 * ���һά���鵽һά���ϵ�ת��
	 */
	public static List<String> array2List(String[] strArr){
		List<String> list = Arrays.asList(strArr);
		return list;
	}
}
