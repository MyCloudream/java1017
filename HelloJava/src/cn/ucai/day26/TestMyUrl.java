package cn.ucai.day26;

import java.util.ArrayList;
import java.util.List;
/**
 * StringBuilder StringBuffer 
 */
public class TestMyUrl {
	public static void main(String[] args) {
		MyUrl mu = new MyUrl();
		mu.setIp("192.168.100.66");
		mu.setPort("8888");
		mu.setProjectName("StudentServer");
		mu.setAction("add");
		
		List<String> paramKey = new ArrayList<String>();
		paramKey.add("name");
		paramKey.add("password");
		paramKey.add("nick");
		List<String> paramValue = new ArrayList<String>();
		paramValue.add("zhangsan");
		paramValue.add("lisi");
		paramValue.add("zhangsan");
		
		mu.setParamKey(paramKey);
		mu.setParamValue(paramValue);
		
		System.out.println(mu);
	}
}
