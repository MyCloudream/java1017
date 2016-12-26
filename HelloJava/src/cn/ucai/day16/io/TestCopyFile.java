package cn.ucai.day16.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ�������
 * ��������Զ��½��ļ���
 */
public class TestCopyFile {
	public static void main(String[] args) {
		File fileSrc = new File("E:/abc/a.wmv");
		File fileDest = new File("E:/abc/b.wmv");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileSrc);
			fos = new FileOutputStream(fileDest);
			int b = 0;
			while((b=fis.read())!=-1){
				System.out.println(b);
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}