package cn.ucai.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��ʼ����ʽ��
 * 1��Ĭ�ϳ�ʼ��
 * 2����̬��ʼ��
 * 3����̬��ʼ��
 * 
 * ��һ�������ܹ�����������͵�һά���鵽һά���ϵ�ת�������������
 * ���ͣ�
 * 1��������
 * 2�����ͷ���
 * 3�����ͽӿ�
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
	 * ���һά���鵽һά���ϵ�ת��
	 */
	public static List<Integer> array2List(Integer[] strArr){
		List<Integer> list = Arrays.asList(strArr);
		return list;
	}
	
	/**
	 * ���һά���鵽һά���ϵ�ת��
	 */
	public static List<String> array2List(String[] strArr){
		List<String> list = Arrays.asList(strArr);
		return list;
	}
}