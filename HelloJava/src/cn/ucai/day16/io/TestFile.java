package cn.ucai.day16.io;

import java.io.File;
import java.io.IOException;

/**
 * File��
 * 
 * Scanner �� 
 * next(); + Integer.parseInt();
 * 
 * nextInt();
 */
public class TestFile {
	public static void main(String[] args) {
		// File file = new File("E:/abc/", "a.txt");

		File fileDir = new File("E:/abc/");
		File file = new File(fileDir, "a.txt");

		try {
			file.createNewFile();
			System.out.println("�ļ������ɹ�");
		} catch (IOException e) {
			System.out.println("�ļ�����ʧ��:" + e.getMessage());
		}
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}
}