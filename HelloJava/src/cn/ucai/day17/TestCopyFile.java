package cn.ucai.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝：
 * 输出流会自动新建文件。
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
			byte[] byArr = new byte[1024*8];// 1个byte 就是一个字节 2 4 8 16 
			while((b=fis.read(byArr))!=-1){
//				System.out.println(b);
				fos.write(byArr,0,b);
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
