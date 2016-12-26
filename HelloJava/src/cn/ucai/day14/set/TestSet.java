package cn.ucai.day14.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * List���ϵ��ص㣺
 * 1��Ԫ�ص����˳���ȡ��˳��һ�£�����
 * 2��Ԫ�ؿ����ظ�
 * 3��Ԫ�ؿ��Ը���get(int index)����ȡ��
 * 4������ʹ��forȡ��������ʹ��Iteratorȡ��������ʹ��foreachȡ����
 * 5��List�в顢�Ƿ������ɾ����������equals������
 * 
 * Set���ϣ�
 * 1��Ԫ�ص����˳���ȡ��˳��һ�� ������,����������������
 * 2��Ԫ�ز����ظ�
 * 3��û��get(int index) ������ͨ��forѭ��ȡ����
 * 4������ʹ��Iterator������foreach���������
 * 
 * Object��
 * HashSet(�ײ���HashMap �ײ�������+����)
 * 	 HashSet��ȥ��ԭ��
 * 		�ȱȽ�Ԫ�ص�hashcode���������hashcode��һ�£�����Ϊ������������洢������
 * 		���hashcodeһ�£���Ƚ�����Ԫ�ص�equals���������equals��һ�£�����Ϊ������������洢������
 * 		���hashcodeһ�£�equalsҲһ�£�����Ϊ��ͬһ�������򲻴洢��
 * 
 *  ������������equals��ȣ������������hashcodeҲ��ȡ�
 *  ������������hashcode��ȣ������������equals��һ����ȡ�
 *  
 *  ��дequals��������дhashCode
 *  1������java�ĳ���Э��,��֤ʹ��HashSetʱ��Ч�����⡣
 *  2��Object��hashCode���õ��ڴ��еĵ�ַ��ÿ��������ڴ��ַ�ǲ�һ���ġ�
 *  
 *  TreeSet:(�ײ���TreeMap �ײ��Ǻ��������ƽ��Ķ�̬�������� )
 *  1��Set�������˳���ȡ��˳��һ�¡�����TreeSet��˵�����ὫԪ�ذ���һ����˳������
 *  2��TreeSet�����ǰ���Ԫ�ص�compareTo������
 *  3��ȥ��Ҳ������compareTo����������÷�������ֵΪ0������Ϊ��ͬһ��Ԫ�أ��򲻴洢��
 *  4��TreeSet�е�Ԫ�أ�Ҫ����пɱȽ��ԣ���Ҫ�пɱȽ��ԣ����ԣ�
 *  	1����Ԫ����ʵ��Comparable�ӿڣ���дcompareTo�������ڸ÷����ж���Ƚϣ����򣩹���
 *  	compareTo�����������0�����ʾ��ͬһ��Ԫ�أ��򲻴洢
 *  	����������������¼����Ԫ�طŵ�ԭԪ�صĺ���
 * 		������ظ��������¼���ķŵ�ǰ�档
 * 		2)����TreeSet������пɱȽ�Ԫ�ص�������ʹ��Comparetor�ӿڡ�
 * 		���ַ�ʽ�Ƚϣ����ȷ��ֻ��һ�ֱȽϷ�ʽ�������߶����ԡ�����ж��ֱȽϷ�ʽ����ʹ��Comparator��
 */
public class TestSet {
	public static void main(String[] args) {
		Person p1 = new Person("����",20);
		Person p2 = new Person("����",18);
		Person p3 = new Person("����",20);
		Person p4 = new Person("����",19);
		Person p5 = new Person("����",22);
		Person p6 = new Person("����",20);
		Set<Person> set = new HashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		for(Person p : set){
			System.out.println(p);
		}
	}
}
