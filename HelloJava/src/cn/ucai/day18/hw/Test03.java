package cn.ucai.day18.hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ͨ��BufferedReader��PrintWriter���E:/abc/Test.java�ı��ļ��Ŀ�����
 */
public class Test03 {
	public static void main(String[] args) {
		// 1����ȡ�ı����ݵ�������
		File file = new File("E:/abc/Test.java");
		String text = readText(file);
		System.out.println(text);
		// 2������һ����ȡ��������д�뵽���ļ���
		File dest = new File("E:/abc/Copy.java");
		writeText(dest,text);
	}
	
	/**
	 * ...
	 * @param dest
	 * @param text
	 */
	public static void writeText(File dest,String text){
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dest),"utf-8"));
			pw.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
	}

	/**
	 * ��ȡָ���ı��ļ�������
	 * @param file �ı��ļ�
	 * @return �ı��ļ�������
	 */
	public static String readText(File file) {
		BufferedReader br = null;
		StringBuilder builder = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
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
