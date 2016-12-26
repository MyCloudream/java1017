package cn.ucai.day26.gene;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {
	/**
	 * ���ͷ����������η��ͷ���ֵ����֮����Ϸ���
	 * @param eArr
	 * @return
	 */
	public <E> List<E> array2List(E[] eArr){
		return Arrays.asList(eArr);
	}
	
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		String[] strArr = {"one","two","three","four","five"};
		List<String> list1 = gm.array2List(strArr);
		
		Integer[] niArr = {1,2,3,4,5,6};
		List<Integer> list2 = gm.array2List(niArr);
	}
}