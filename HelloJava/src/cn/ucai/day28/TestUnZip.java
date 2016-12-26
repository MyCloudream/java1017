package cn.ucai.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 单文件的解压缩
 */
public class TestUnZip {
	public static void main(String[] args) {
		File fileZip = new File("E:/copy/Test.zip");
		ZipInputStream zis = null;
		FileOutputStream fos = null;
		try {
			zis = new ZipInputStream(new FileInputStream(fileZip));
			ZipEntry zn = zis.getNextEntry();
			String name = zn.getName();
			File file = new File("E:/abc/",name);
			fos = new FileOutputStream(file);
			int b = 0;
			byte[] byArr = new byte[1024*4];
			while((b=zis.read(byArr))!=-1){
				fos.write(byArr, 0, b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				zis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
