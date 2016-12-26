package cn.ucai.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ���ڽ���Ŀ�е�properties�����ļ��е����ݶ�ȡ������
 */
public class PropertiesUtil {
	/**
	 * ��ָ����proName��properties�ļ��л�ȡָ��key��Ӧ��vlaue
	 * @param key 
	 * @param proName
	 * @return
	 */
	public static String getValue(String key,String proName){
		Properties p = new Properties();
		String value = null;
		String path = PropertiesUtil.class.getResource("/").getPath();
		try {
			p.load(new FileInputStream(new File(path,proName)));
			// ����keyȡvalue
			value = p.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
