package cn.ucai.day26;

public class TestStringBuilder {
	public static void main(String[] args) {
		/*StringBuilder builder = new StringBuilder();
		builder.append("http://")
			.append("192.168.100.66")
			.append(":8888")
			.append("/StudentManager")
			.append("/add");
		String str = builder.toString();
		System.out.println(str);*/
		
		MyStringBuilder myBuilder = new MyStringBuilder();
		String str = myBuilder.append("http://")
		.append("192.168.100.66")
		.append(":8888")
		.append("/StudentManager")
		.append("/add")
		.builder();
		
		System.out.println(str);
	}
}
