package cn.ucai.day16.io;

import java.io.File;
import java.io.IOException;

/**
 * File��
 * 
 */
public class TestFile2 {
	public static void main(String[] args) {
		// File����Ӳ�����ļ����ļ��еĳ����ʾ���������ļ����ڲ�����û�й�ϵ��
		File file = new File("E:/abc/a.txt");
		try {
			file.createNewFile();
			System.out.println("�ļ������ɹ�");
		} catch (IOException e) {
			System.out.println("�ļ�����ʧ��:"+e.getMessage());
		}
	}
}
