package cn.ucai.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Collection �� Collections ��ʲô��ϵ��
 * Collection����Iterable���ӽӿڣ���List��Set�ĸ��ӿڡ�
 * Collections���Ǽ�����صĹ����࣬���������һЩ�������ϵĳ��÷��� 
 */
public class TestCollection {
	public static void main(String[] args) {
		// ������תΪList����
		String[] strArr = {"zhangsan","lisi","wangwu"};
//		List<String> list = Arrays.asList(strArr);
		List<String> list = Arrays.asList("zhangsan","lisi","wangwu");
		System.out.println(list);
		// List����ת��Ӧ���͵�����
		/*List<String> list = new ArrayList<String>();
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");
		String[] strArr = list.toArray(new String[] {});
		System.out.println(Arrays.toString(strArr));*/
	}
}
