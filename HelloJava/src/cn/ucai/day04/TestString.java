package cn.ucai.day04;

/**
 * �����������͵ıȽϣ�ʹ��==
 * �����������͵ıȽϣ�ʹ��equals
 * 
 * �������ֵ��ã�
 * 1��ʹ������. ����Math.pow(2,4);
 * 2��ʹ�ö���(����). 
 */
public class TestString {
	public static void main(String[] args) {
		String s = "this is a test of java";
		/*int count = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='s'){
				count ++ ;
			}
		}
		System.out.println(count);*/
		
		String s2 = s.replace("s","");
		System.out.println(s2);
		System.out.println(s.length()-s2.length());
		
	/*	int a = 2;
		System.out.println(a==2);
		String str1 = "abc";
		System.out.println(str1.equals("ABC"));
		
		
		String str2 = "abcdef�й�";
		System.out.println(str2.length());
		
		String str3 = "abcdef";
		System.out.println(str3.substring(2));
		System.out.println(str3.substring(2,4));// [2-4)
		
		char ch = str3.charAt(3);
		System.out.println(ch);
		*/
		
	}
}
