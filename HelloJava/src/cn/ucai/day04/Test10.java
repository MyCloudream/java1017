package cn.ucai.day04;

public class Test10 {
	public static void main(String[] args) {
		String str = "this is a test of java";
		int count = 0;
		for(int i=0;i<str.length();i++){
			// �ж�ĳ���±��϶�Ӧ���ַ��ǲ���s
			if(str.charAt(i)=='s'){
				count ++ ;
			}
		}
		System.out.println("s�ĸ���Ϊ��"+count);
		
		// ��str������е�s�滻Ϊ""���ַ���
		String s = str.replace("s", "");
		System.out.println(s);
		// �����������Ȳ�õ�s�ĸ���
		System.out.println(str.length()-s.length());
	}
}
