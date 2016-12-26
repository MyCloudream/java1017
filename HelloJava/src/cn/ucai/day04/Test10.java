package cn.ucai.day04;

public class Test10 {
	public static void main(String[] args) {
		String str = "this is a test of java";
		int count = 0;
		for(int i=0;i<str.length();i++){
			// 判断某个下标上对应的字符是不是s
			if(str.charAt(i)=='s'){
				count ++ ;
			}
		}
		System.out.println("s的个数为："+count);
		
		// 把str里的所有的s替换为""空字符串
		String s = str.replace("s", "");
		System.out.println(s);
		// 根据两个长度差，得到s的个数
		System.out.println(str.length()-s.length());
	}
}
