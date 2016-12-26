package cn.ucai.day06;

public class TestAdd {
	public static void main(String[] args) {
		int[] niArr = {2,3};
		int n1 = add(niArr);
		/*System.out.println(n1);
		int n2 = add(2,3,4,5,6,7);
		System.out.println(n2);
		int n3 = add(2,3,4,5,6,7,2,3,4,5,6,7,2,3,4,5,6,7);
		System.out.println(n3);*/
	}
	
	/*public static int add(int... ni){
		int sum = 0;
		for(int i=0;i<ni.length;i++){
			sum += ni[i];
		}
		return sum;
	}*/
	public static int add(int[] ni){
		int sum = 0;
		for(int i=0;i<ni.length;i++){
			sum += ni[i];
		}
		return sum;
	}
}
