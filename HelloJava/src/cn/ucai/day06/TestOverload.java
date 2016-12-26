package cn.ucai.day06;

/**
 * ��ϰ���������ص�add�������������int����ӣ�int��String����ӣ�String��int����ӣ�int��double���͵���ӣ�����int����ӡ�
 * ���أ�overload����ͬ����ͬ��
 * ��ͬ�Σ�
 * 1�����Ͳ�ͬ
 * 2��˳��ͬ
 * 3��������ͬ
 * 
 * �ɱ䳤����������add����Ҳ��������
 * �ɱ䳤�����൱�����飬���ܺ�����ͬʱ���ڡ�
 * �ɱ䳤����ֻ����Ϊ���������һ����
 */
public class TestOverload {
	
	public static int add(int a,int b){
		return a + b;
	}
	
	public static String add(int a,String b){
		return a + b;
	}
	
	public static String add(String a,int b){
		return a + b;
	}
	
	public static double add(int a,double b){
		return a + b;
	}
	
	public static int add(int a,int b,int c){
		return a + b + c;
	}
	
	public static int add(int a,int... ni){
		int sum = 0;
		for(int i=0;i<ni.length;i++){
			sum += ni[i];
		}
		return sum;
	}
	
	public static int add(int[] ni){
		int sum = 0;
		for(int i=0;i<ni.length;i++){
			sum += ni[i];
		}
		return sum;
	}
}
