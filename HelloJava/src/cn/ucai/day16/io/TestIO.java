package cn.ucai.day16.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �����Ҫ�����ݴ洢�ڱ����ļ��С�������ӱ����ļ��ж�ȡһЩ���ݵ������У�����ҪIO�������֪ʶ��
 * �ļ������������ļ��е����ݣ���ȡ�������С�
 * 
 * ��������˳���ȡ�ġ�
 */
public class TestIO {
	public static void main(String[] args) {
		File file = new File("E:/abc/a.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			for(;;){
				int b = fis.read();
				if(b==-1){
					break;
				}
				System.out.println((char)b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally {// ���ڹر���Դ������ʱ�ļ�
			try {
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}