package cn.ucai.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * unicode : 一个字符占2个字节   1000个英文字母
 * 在GBK或GB2312编码下，汉字占2个字节
 * 在utf-8编码下，汉字占3个字节
 * 
 * 当有包装流的使用时，在finally中只需要关闭最外层的包装流即可。
 * 
 * 乱码根源：两边（程序和文件、前端和后台、代码和数据库、不同软件）编码不一致。
 */
public class TestISR {
	public static void main(String[] args) {
		File file = new File("E:/abc/a.txt");
		FileInputStream fis = null;
		InputStreamReader isr = null;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"GBK");
			System.out.println((char)(isr.read()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try {
				if(isr!=null){
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
