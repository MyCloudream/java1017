package cn.ucai.day06;

/**
 * һ�����еĶ������֮�䣺
 * ����ͬ����ͬ�Σ���Ϊ���������ء�
 * ����ֵ����û��Ҫ��
 */
public class TestToString {
	public static void main(String[] args) {
		int[] niArr = {3,1,5,2,4};
		toString(niArr);
		String[] strArr = {"����","����","����","����","����","����"};
		toString(strArr);
	}
	
	/**
	 * ������String����һά�����ʽ�����
	 */
	public static void toString(String[] strArr){
		System.out.print("[");
		for(int i=0;i<strArr.length;i++){
			if(i==strArr.length-1){
				System.out.print(strArr[i]);
			}else{
				System.out.print(strArr[i]+", ");
			}
		}
		System.out.println("]");
	}
	
	/**
	 * ������int����һά�����ʽ�����
	 */
	public static void toString(int[] niArr){
		System.out.print("[");
		for(int i=0;i<niArr.length;i++){
			if(i==niArr.length-1){
				System.out.print(niArr[i]);
			}else{
				System.out.print(niArr[i]+", ");
			}
		}
		System.out.println("]");
	}
}
