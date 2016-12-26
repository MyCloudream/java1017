package cn.ucai.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1���ֽ���
 * 2�����ļ��򽻵������ļ����������
 */
public class TestFileCopy {
	public static void main(String[] args) {
		File fileSrc = new File("E:/abc/TestInteger.java");
		File fileDest = new File("E:/abc/TestInteger2.java");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileSrc);
			fos = new FileOutputStream(fileDest);
			int b = 0;
			byte[] byArr = new byte[1024*4];
			while((b=fis.read(byArr))!=-1){
				fos.write(byArr, 0, b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}