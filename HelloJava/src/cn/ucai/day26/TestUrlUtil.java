package cn.ucai.day26;

public class TestUrlUtil {
	public static void main(String[] args) {
		UrlUtil url = new UrlUtil();
		String str = url.append("192.168.100.66:")
			.append("8080")
			.append("/StudentServer")
			.append("/add")
			.appendParam("name", "zhangsan")
			.appendParam("password","123456")
			.appendParam("nick","zhangsan")
			.builder();
		
		System.out.println("result :"+str);
	}
}
