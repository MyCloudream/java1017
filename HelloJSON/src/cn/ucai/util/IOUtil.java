package cn.ucai.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {
	
	public static String getText(String file){
		return getText(new File(file));
	}
	
	/**
	 * 从指定文本中读取json格式的内容
	 * 模拟从服务端获取json格式数据的操作
	 * @param file
	 * @return
	 */
	public static String getText(File file){
		BufferedReader br = null;
		StringBuilder builder = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
			String str = null;
			while((str = br.readLine())!=null){
				builder.append(str);
				builder.append("\r\n");
			}
			return builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
