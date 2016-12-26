package cn.ucai.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IO流学习的难点：名称太多
 * 按照方向来分：输入流和输出流
 * 按照处理的最小单元来分：字节流和字符流
 * 按照在包装类中的地位，称为基本流（节点流）和包装流（扩展流）
 * 每个流又可以直译来命名。
 * 
 * 字节流：InputStream/OutputStream 
 * 字符流：Reader Writer 
 * 
 * 所有InputStream结尾的，都是InputStream的子类
 * 所有OutputStream结尾的，都是OutputStream的子类
 * 所有Reader结尾的，都是Reader的子类
 * 所有Writer结尾的，都是Writer的子类
 * 
 * InputStreamReader:转换流:将字节流转换为字符流。
 * OutputStreamWriter：转换流：将字符转为字节
 * 
 * BufferedReader/BufferedWriter:缓冲流
 * PrintWriter：和BufferedReader配合使用
 * 
 * 流都是成对出现的。
 * 
 * 文本文件  / 二进制文件
 * 文本文件：.txt .cmd .java .xml .json .sql .html .css .js 等
 * 二进制文件：.png .jpg .wmv .xls .doc .zip .jar 等
 * 什么时候使用字节流，什么时候使用字符流？
 * 1、文件的拷贝：
 * 2、文件的下载：
 * 3、文件的上传：
 * 4、文本文件的拷贝：
 * 5、文本文件内容的读取或写入：
 * 6、网页内容的读取：
 * 
 * char ch = '中';
 */
public class TestBR {
	public static void main(String[] args) {
		String path = "E:/abc/a.txt";
		String strText = getText(path);
		System.out.println(strText);
	}
	
	/**
	 * 为不同用户提供多个重载的功能
	 * @param path
	 * @return
	 */
	public static String getText(String path){
		return getText(new File(path));
	}
	
	/**
	 * 将指定文本文件中的内容读取出来
	 * @param file 指定的文本文件
	 * @return 文本文件中的内容
	 */
	public static String getText(File file){
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringBuilder builder = null;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"UTF-8");
			br = new BufferedReader(isr);
			String str = null;
			builder = new StringBuilder();
			while((str=br.readLine())!=null){
				builder.append(str);
				// 每读取一行，换个行
				builder.append("\r\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try {
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return builder.toString();
	}
}
