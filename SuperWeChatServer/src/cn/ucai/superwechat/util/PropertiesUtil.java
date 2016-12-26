package cn.ucai.superwechat.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 用于将项目中的properties配置文件中的内容读取出来。
 */
public class PropertiesUtil {
	public static void main(String[] args) {
		getValue("jdbcDriver", "jdbc.properties");
	}
	/**
	 * 在指定的proName的properties文件中获取指定key对应的vlaue
	 * @param key 
	 * @param proName
	 * @return
	 */
	public static String getValue(String key,String proName){
		Properties p = new Properties();
		String value = null;
		String path = PropertiesUtil.class.getResource("/").getPath();
		System.out.println(path);
		try {
			p.load(new FileInputStream(new File(path,proName)));
			// 根据key取value
			value = p.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
