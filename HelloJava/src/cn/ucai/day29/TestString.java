package cn.ucai.day29;

public class TestString {
	public static void main(String[] args) {
		String s = "abcabcabcdabc";
		/*System.out.println(s.indexOf("b"));
		System.out.println(s.lastIndexOf("b"));*/
		
		// ����b��λ��
		int n = s.indexOf("b");
		System.out.println(n);
		while(n!=-1){
			n = s.indexOf("b", (n+1));
			System.out.println(n);
		}
	}
}
